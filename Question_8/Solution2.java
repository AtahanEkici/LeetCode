package Question_8;

public class Solution2 
{
    public static char[] valid_chars = {'1','2','3','4','5','6','7','8','9','0','-','+','.'};
     
    public static int myAtoi(String s) 
    {
        s = s.replaceAll(" ",""); // delete all the empty characters of the string //
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<valid_chars.length;j++)
            {
                if(s.charAt(j) == valid_chars[j])
                {
                    //s = s.replaceAll(, "");
                }
            }
        }
        
        return 0;
    }
}
