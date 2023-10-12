package Question_2710;
// SOLVED //
public class Solution 
{
    public static String removeTrailingZeros(String num) 
    {
        num = num.strip();
        
        int counter = 0;
        
        for(int i=(num.length()-1);i>0;i--)
        {
            if(num.charAt(i) != '0')
            {
              return num.substring(0, num.length() - counter);   
            }
            else
            {
                counter++;
            }
        }
        return num;
    }
}
