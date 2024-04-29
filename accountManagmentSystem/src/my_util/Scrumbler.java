/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_util;

import javax.crypto.Cipher;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec; 
import javax.crypto.spec.IvParameterSpec;
import java.security.GeneralSecurityException;
import java.util.Base64;

/**
 *
 * @author Waleed Alsanie
 */
public class Scrumbler {
    
    private Cipher cipher;
    private static final String algo = "AES";
    private Key key;
    
    public Scrumbler() {
        
        byte[] newKeyStr = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e',
            'f', 'f', 'g', 'g', '1', '1'};
        try {
            this.cipher = Cipher.getInstance(Scrumbler.algo +
                    "/CBC/PKCS5Padding");
            this.key = new SecretKeySpec(newKeyStr, Scrumbler.algo);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
    
    
    public Scrumbler(String keyStr) {
        
        byte[] newKeyStr = this.trimFillKeyStr(keyStr);
        try {
            this.cipher = Cipher.getInstance(Scrumbler.algo +
                    "/CBC/PKCS5Padding");
            this.key = new SecretKeySpec(newKeyStr, Scrumbler.algo);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
    
    private byte[] trimFillKeyStr(String keyStr) {
        
        if (keyStr.length() == 16) {
            return keyStr.getBytes();
        }
        byte[] finalKeyStr = new byte[16];
        byte[] str1 = keyStr.getBytes();
        if (keyStr.length() > 16) {         
            for (int i = 0; i < 16; i++) {
                finalKeyStr[i] = str1[i];
            }
        } else {
            for (int i = 0; i < keyStr.length(); i++) {
                finalKeyStr[i] = str1[i];
            }
        }
        return finalKeyStr;
    }
    
    public String encrypt(String message) {
        try {
            byte[] iv = new byte[16];
            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));
            byte[] plainText  = message.getBytes("UTF-8");
            byte[] cipherText = cipher.doFinal(plainText);
            
            return Base64.getEncoder().encodeToString(cipherText);
        } catch (GeneralSecurityException | 
                UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } 
    }
    
    public String decrypt(String encrypted) {
        try {
            byte[] iv = new byte[16];
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
            byte[] base64decodedTokenArr = Base64.getDecoder().decode(
                    encrypted.getBytes());
            byte[] plainText = cipher.doFinal(base64decodedTokenArr);
            
            return new String(plainText);
        } catch (GeneralSecurityException e){
            e.printStackTrace();
            return null;
        } 
    }
    
}
