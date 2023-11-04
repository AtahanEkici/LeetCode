package Question_204;
// SOLVED //
public class Solution
{
    public static int countPrimes(int n) 
    {
        if (n <= 2)
        {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        int primeCount = 0;

        for (int i = 2; i < n; i++) 
        {
            if (!isPrime[i]) 
            {
                primeCount++;
                
                for (int j = 2 * i; j < n; j += i)
                {
                    isPrime[j] = true;
                }
            }
        }
        return primeCount;
    }
}

