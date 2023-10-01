package Question_6;
import static Question_6.Solution.ReadLine;

public class Solution2 
{
    public static String convert(String s, int numRows)
    {
        String[] temp = s.split("\n");
        String total = "";
        
        for(int i=0;i<temp.length;i++)
        {
            total += temp[i];
        }
        
        return total.replaceAll(" ","");
    }
}
