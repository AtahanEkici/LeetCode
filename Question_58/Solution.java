package Question_58;
// SOLVED //
public class Solution 
{
    public static int lengthOfLastWord(String s)
    {
        s = s.strip();
        String[] last =  s.split(" ");
       /*
        System.out.println(Arrays.toString(last));
        System.out.println(last[last.length-1]);
        System.out.println(last[last.length-1].length());
        */
        return last[last.length-1].length();
    }
}
