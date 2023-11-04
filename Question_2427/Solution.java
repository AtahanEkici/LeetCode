package Question_2427;
// SOLVED //
public class Solution 
{
    public static int commonFactors(int a, int b) 
    {
        int commonFactorCounter = 0;
        int smallest = FindSmallest(a,b);
        int counter = 1;
        
        while(counter <= smallest)
        {
            if(a % counter == 0 && b % counter == 0)
            {
                commonFactorCounter++;
            }
            counter++;
        }
        return commonFactorCounter;
    }
    public static int FindSmallest(int a, int b)
    {
        if(a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
