package Question_367;
// SOLVED //
public class Solution
{
    public static double calculateSquareRoot(int num)
    {
        if (num < 0) 
        {
            num *= -1;
        }

        double guess = num / 2.0;

        while (Math.abs(guess * guess - num) > 0.00001)
        {
            guess = 0.5 * (guess + num / guess);
        }

        //System.out.println(guess);
        return guess;
    }
   
public static boolean isAbsoluteInteger(double value) 
{
    double fractionalPart = value - Math.floor(value);
    return fractionalPart < 0.00001;
}
   
public static boolean isPerfectSquare(int num)
{
        double result = calculateSquareRoot(num);
        System.out.println(result);
        return isAbsoluteInteger(result);
}
}
