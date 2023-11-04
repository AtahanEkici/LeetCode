package Question_264;
// SOLVED //
public class Solution 
{
    public static int nthUglyNumber(int n) 
    {
        if (n <= 0) 
        {
            return 0;
        }

        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;

        for (int i = 1; i < n; i++) 
        {
            int nextUgly = Math.min(uglyNumbers[index2] * 2, Math.min(uglyNumbers[index3] * 3, uglyNumbers[index5] * 5));
            uglyNumbers[i] = nextUgly;

            if (nextUgly == uglyNumbers[index2] * 2)
            {
                index2++;
            }
            if (nextUgly == uglyNumbers[index3] * 3)
            {
                index3++;
            }
            if (nextUgly == uglyNumbers[index5] * 5) 
            {
                index5++;
            }
        }
        return uglyNumbers[n - 1];
    }
}
