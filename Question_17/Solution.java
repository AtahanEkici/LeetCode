package Question_17;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    private static final String two = "abc";
    private static final String three = "def";
    private static final String four = "ghi";
    private static final String five = "jkl";
    private static final String six = "mno";
    private static final String seven = "pqrs";
    private static final String eight = "tuv";
    private static final String nine = "wxyz";
    
    public static ArrayList<String> getAllUniqueSubset(String str) 
    {      
        int length = str.length();
        int number_of_digits = (length / 3);
        
        String temp = "";
        
        ArrayList<String> results = new ArrayList<>();  
        
        for(int i = 0; i < length; i++) 
        {    
            for(int j = i; j < length; j++) 
            {  
                results.add(str.substring(i, j+1));
            }  
        }  
        return results;
    }
    
    public static List<String> letterCombinations(String digits) 
    { 
        if(digits == null || digits.length() <= 0) {return null;}
        
        digits = digits.trim();
        
        String sum = "";
       
        int counter = 0;
       
        for(int i=0;i<digits.length();i++)
        {
            switch(digits.charAt(i))
            {       
                case '2':
                    sum += two;
                    break;
                    
                case '3':
                    sum += three;
                    break;
                
                case '4':
                    sum += four;
                    break;
                    
                case '5':
                    sum += five;
                    break;
                       
                case '6':
                    sum += six;
                    break;
                    
                case '7':
                    sum += seven;
                    break;
                    
                case '8':
                    sum += eight;
                    break;
                
                case '9':
                    sum += nine;
                    break;
                
                default:
                    break;
                    
            }
        }
        return getAllUniqueSubset(sum);
    }
}