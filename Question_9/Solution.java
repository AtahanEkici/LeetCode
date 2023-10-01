package Question_9;

public class Solution 
{
    public static boolean isPalindrome(int x) 
    {
        String forward = Integer.toString(x);
        String backward = "";
        
        for(int i=forward.length()-1;i>=0;i--)
        {
            backward += forward.charAt(i); 
        }
        
        System.out.println("Forward: "+forward);
        System.out.println("Backward: "+backward);
        
        if(backward.equals(forward))
        {
            System.out.println(true);
            return true;
        }
        else
        {
            System.out.println(false);
            return false;
        }
    }
}
