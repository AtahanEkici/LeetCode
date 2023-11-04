package Question_29;

import java.math.BigInteger;
//SOLVED //
public class Solution 
{
    public static int divide(int dividend, int divisor) 
    {
        BigInteger dividend_value = BigInteger.valueOf(dividend);
        BigInteger divisor_value = BigInteger.valueOf(divisor);
        BigInteger result = dividend_value.divide(divisor_value);
        
        System.out.println("Result: "+result);
        
        if(result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0)
        {
            return Integer.MAX_VALUE;
        }
        else if(result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return result.intValue();
        }
    }
}
