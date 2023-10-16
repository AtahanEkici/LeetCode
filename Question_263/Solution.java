package Question_263;

public class Solution 
{
    public static boolean isUgly(int n) 
    {
        if(n < 0)
        {
            n = n * -1;
        }
        
        while(n % 2 == 0)
        {
            n = n / 2;
        }
        
        while(n % 3 == 0)
        {
            n = n / 3;
        }
        
        while(n % 5 == 0)
        {
            n = n / 5;
        }
        
        System.out.println(n);

        if(n == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
