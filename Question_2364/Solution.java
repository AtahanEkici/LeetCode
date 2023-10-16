package Question_2364;

public class Solution 
{
    public static int countBadPairs(int[] nums)
    {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (i < j && j - i != nums[j] - nums[i]) 
                {
                    count++;
                }
            }
        }
        return count;
    }
}
