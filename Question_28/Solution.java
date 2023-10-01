package Question_28;
public class Solution 
{
    public static int strStr(String haystack, String needle) 
    {
        int needle_index = 0;
        int beginning_index = 0;

        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.equals(needle)){return beginning_index;}
            
            if(haystack.charAt(i) == (needle.charAt(needle_index)))
            {
                beginning_index = i;

                for(int j=i+1;j<haystack.length();j++)
                {
                    System.out.print(needle.charAt(needle_index));
                    
                    if(needle.length()-1 <= needle_index++ ){return beginning_index;}

                    if(haystack.charAt(j) != (needle.charAt(needle_index)))
                    {
                        needle_index = 0;
                        break;
                    }
                }
            }
        }
        return -1;
    }
}