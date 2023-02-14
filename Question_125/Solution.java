package Question_125;
// >> Accepted: https://leetcode.com/problems/valid-palindrome/submissions/897981961/ //
public class Solution
{
    public static boolean isPalindrome(String s)
    {
        String filteredString = s.replaceAll("[^\\p{Alnum}\\s]", ""); // Regex aquired by prompting chat gpt //
        filteredString = filteredString.replaceAll(" ", "");
        filteredString = filteredString.toLowerCase();
        System.out.println(filteredString);
        
        if(CheckPalindrome(filteredString) == false)
        {
            return false;
        }
        return true;
    }
    public static boolean CheckPalindrome(String s)
    {
        int last_index = s.length() - 1;
        
        for(int i=0;i<(int)(s.length()/2);i++)
        {
            if(s.charAt(i) != s.charAt(last_index))
            {
                return false;
            }
            last_index--;
        }
        return true;
    }  
}