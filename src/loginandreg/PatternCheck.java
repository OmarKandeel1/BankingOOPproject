/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandreg;

import java.util.regex.*;


public class PatternCheck {

    public static Boolean MatchPattern(String EnteredPattern)
    {
        
        
        Pattern pattern = Pattern.compile("^(?=(.*[a-z]){2})(?=(.*[A-Z]){2})(?=.*\\d{8,})(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.</>?]).+$");

        // Match the pattern against the string
        Matcher matcher = pattern.matcher(EnteredPattern);

        // Check if the pattern is found in the string
        if (matcher.matches()) {
            return true;
        } 
        return false;
    }
    public static Boolean MatchPattern8Num(String EnteredPattern)
    {
        
        
        Pattern pattern = Pattern.compile("^\\\\d{8}$");

        // Match the pattern against the string
        Matcher matcher = pattern.matcher(EnteredPattern);

        // Check if the pattern is found in the string
        if (matcher.matches()) {
            return true;
        } 
        return false;
    } 
}