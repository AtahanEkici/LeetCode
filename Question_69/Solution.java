package Question_69;
// SOLVED //
public class Solution 
{
    public static int mySqrt(int x) 
    {
        return (int)calculateSquareRoot(x);
    }
    
    public static double calculateSquareRoot(int num) 
     {
        if (num < 0) 
        {
            num = num * -1;
        }

        double guess = num / 2.0; // Initial guess, you can choose any positive number

        while (Math.abs(guess * guess - num) > 0.1) 
        {
            guess = 0.5 * (guess + num / guess);
        }

        return guess;
    }
}
