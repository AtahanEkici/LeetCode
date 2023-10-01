package Question_6;
//! wrong answer //
public class Solution
{
    public static String convert(String s, int numRows)
    {
        String total = "";
        String[] temp = s.split("\n");
        int counter = 0;
        
        for(int i=0;i<temp.length;i++)
        {
            counter++;
            if(counter > 1){break;}
            
            for(int j=0;j<temp[i].length();j++)
            {
                for(int k=0;k<numRows;k++)
                {
                    try
                    {
                        total += temp[k].charAt(j);
                    }
                    catch(Exception e)
                    {
                        //System.out.println("K: "+k+" J: "+j+"");
                        //System.out.println(e);
                    }
                }
            }
        }
        return total.replaceAll(" ","");
    }
    protected static void ReadLine(String[] parts)
    {
        for(int i=0;i<parts.length;i++)
        {
            System.out.println("Row"+i+": "+parts[i]);
        }
    }

}
