package Question_268;

import java.util.Arrays;
// SOLVED //
public class Solution
{
    public static int missingNumber(int[] nums)
    {
        Arrays.sort(nums); // Sort the array then look for the ideal number for each passing if the number is not there return the ideal one //
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != i)
            {
                return i;
            }
        }
        return (nums.length);
    }
}
