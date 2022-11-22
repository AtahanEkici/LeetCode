 package Question_20;

public class Solution 
{
    private static final char left_pharanthes = '(';
    private static final char right_pharantes = ')';
        
    private static final char left_curly_bracket = '{';
    private static final char right_curly_bracket = '}';
        
    private static final char left_square_bracket = '[';
    private static final char right_square_bracket = ']';
    
    public static boolean isValid(String s)
    {
        int left_index = 0;
        int right_index = s.length() - 1;
        
        char left_char;
        char right_char;
        
        for(int i=0;i<s.length()/2;i++)
        {
            left_char = s.charAt(left_index);
            right_char = s.charAt(right_index);
            
            if(!(left_char == left_pharanthes && right_char == right_pharantes))
            {
                return false;
            }
            else if(!(left_char == left_curly_bracket && right_char == right_curly_bracket))
            {
                return false;
            }
            else if(!(left_char == left_square_bracket && right_char == right_square_bracket))
            {
                return false;
            }
            
            left_index++;
            right_index--;
        }
        return true;
    }
}
