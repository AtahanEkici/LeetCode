package Question_118;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

// SOLVED //
public class Solution 
{
    public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
        {
            result.add(calc(i));
        }
        return result;
    }
    
    public static List<Integer> calc(int rowNumber)
    {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i <= rowNumber; i++)
        {
            result.add(combination(rowNumber, i));
        }
        return result;
    }

    public static int combination(int number, int target)
    {
        BigInteger numerator = factorial(number);
        BigInteger denominator = factorial(target).multiply(factorial(number - target));
        return numerator.divide(denominator).intValue();
    }

    public static BigInteger factorial(int number)
    {
        BigInteger result = BigInteger.ONE;

        if(number == 0 || number == 1)
        {
            return BigInteger.ONE;
        }
        else
        {
            for(int i = 2; i <= number; i++)
            {
                result = result.multiply(BigInteger.valueOf(i));
            }

            return result;
        }
    }
}
