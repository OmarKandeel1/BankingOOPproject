/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandreg;

import java.util.regex.*;


public class PatternChecker {

    public static Boolean MatchPattern(String EnteredPattern)
    {
        int i=0;
        int CouChars=0,CouNums=0,CouSChars=0,CouCChars=0;
        for(i=0;i<EnteredPattern.length();i++)
        {
            char q=EnteredPattern.charAt(i);
            if(q<='9'&&q>='0')
            {
                CouNums++;
            }
            else if(q>='a'&&q<='z')
            {
                CouChars++;
            }
            else if(q>='A'&&q<='Z')
            {
                CouCChars++;
            }
            else if(q=='@'||q=='!'||q=='_'||q=='-')
            {
                CouSChars++;
            }
            
        }
        
        if(CouNums>8&&CouCChars>0&&CouChars>0&&CouSChars>0)
        {
            return true;   
        }
        
        
        return false;
    }
    
    
    
    public static Boolean MatchPattern8Num(String EnteredPattern)
    {
        int i=0;
        int CouNums=0;
        for(i=0;i<EnteredPattern.length();i++)
        {
            char q=EnteredPattern.charAt(i);
            if(q<='9'&&q>='0')
            {
                CouNums++;
            }            
        }
        
        if(CouNums>8)
        {
            return true;   
        }
        
        
        return false;
    } 
    
    
    
    
    public static Boolean MatchPatternchars(String EnteredPattern)
    {
        
        
        int i=0;
        int CouChars=0,CouCChars=0;
        for(i=0;i<EnteredPattern.length();i++)
        {
            char q=EnteredPattern.charAt(i);
            if(q>='a'&&q<='z')
            {
                CouChars++;
            }
            else if(q>='A'&&q<='Z')
            {
                CouCChars++;
            }
            
            
        }
        
        if(CouCChars>0&&CouChars>0)
        {
            return true;   
        }
        
        
        return false;
    }
    
    
    
    
    public static Boolean MatchPatternSchars(String EnteredPattern)
    {
        
        int i=0;
        int CouSChars=0;
        for(i=0;i<EnteredPattern.length();i++)
        {
            char q=EnteredPattern.charAt(i);
           if(q=='@'||q=='!'||q=='_'||q=='-')
            {
                CouSChars++;
            }
            
        }
        
        if(CouSChars>0)
        {
            return true;   
        }
        
        
        return false;
    }
    
    
}
