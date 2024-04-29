/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Waleed Alsanie
 */
public class SpecialCharChecker {
    
    public static boolean containsSpecialChar(String str) {
        
        Pattern ptr = Pattern.compile("[^A-Za-z0-9_\\.]");
        Matcher mtch = ptr.matcher(str);
        return mtch.find();
    }
    
}
