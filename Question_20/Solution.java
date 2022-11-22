package Question_20;

public class Solution 
{
    private static final char left_pharanthes = '(';
    private static final char right_pharantes = ')';
        
    private static final char left_curly_bracket = '{';
    private static final char right_curly_bracket = '}';
        
    private static final char left_square_bracket = '[';
    private static final char right_square_bracket = ']';
    
    public boolean isValid(String s)
    {
        int lp = 0;
        int rp = 0;
        
        int lcb = 0;
        int rcb = 0;
        
        int lsb = 0;
        int rsb = 0;
        
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case left_pharanthes:
                    lp++;
                    break;
                    
                case right_pharantes:
                    rp++;
                    break;
                    
                case left_curly_bracket:
                    lcb++;
                    break;
                    
                case right_curly_bracket:
                    rcb++;
                    break;
                    
                case left_square_bracket:
                    lsb++;
                    break;
                        
                case right_square_bracket:
                    rsb++;
                    break;
            }
        }
        
        if(lp != rp)
        {
            return false;
        }
        else if(lcb != rcb)
        {
            return false;
        }
        else if(lsb != rsb)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
}
