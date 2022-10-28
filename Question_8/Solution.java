package Question_8;

import java.util.ArrayList;

public class Solution 
{
    /*
    public static ArrayList<Integer> ints = new ArrayList<>();
    
    public static boolean isNegative = false;
    public static boolean hasInt = false;
    public static long result = 0;
    
    public static char[] valid_chars = {'1','2','3','4','5','6','7','8','9','0','-','+','.'};
    
    public static void Check(char a)
    {
        switch(a)
        {
            case '1': ints.add(1); break;
            
            case '2': ints.add(2); break;
            
            case '3': ints.add(3); break;
            
            case '4': ints.add(4); break;
            
            case '5': ints.add(5); break;
            
            case '6': ints.add(6); break;
            
            case '7': ints.add(7); break;
            
            case '8': ints.add(8); break;
            
            case '9': ints.add(9); break;
            
            case '0': ints.add(0); break;
            
            case '-': if(isNegative == true) {result = 0;break;}else{isNegative = true;}; break;
            
            default: break;    
        }
    }
    
    public static int myAtoi(String s) 
    {
        if(s == null) {return 0;}
        
        s = s.replaceAll(" ", "");
        
        for(int i=0;i<valid_chars.length;i++)
        {
            if(s.charAt(0) == valid_chars[i])
        {
            hasInt = true;
        }
        }
        if(hasInt == false)
        {
            return 0;
        }
        
        char temp = s.charAt(0);
        
        for(int i=0;i<s.length() && temp != valid_chars[valid_chars.length-1];i++)
        {
            temp = s.charAt(i);
            Check(temp);
            //System.out.println(temp);
        }
        //System.out.println(integers);
        
        for(int j=0;j<ints.size();j++)
        {
            result += ints.get(j) * Math.pow(10, (ints.size()-1-j));
        }
        
        if(isNegative)
        {
            result = (result * -1);
        }
        
        int negative_boundary = (int)(((Math.pow(2, 31)) - 1) * -1);
        int positive_boundary = (int)((Math.pow(2, 31)) - 1);
        
        if(result < negative_boundary)
        {
            result = negative_boundary;
        }
        else if(result > positive_boundary)
        {
            result = positive_boundary;
        }
        //System.out.println(result);
        System.out.println(ints);
        return (int)result;
    }
*/
}
