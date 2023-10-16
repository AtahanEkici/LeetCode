package Question_2006;
// SOLVED //
public class Solution 
{
    public static int countKDifference(int[] nums, int k)
    {
        int counter = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                //System.out.println(Math.abs(nums[i] - nums[j]));
                
                if(j == i)
                {
                    continue;
                }
                else if(Math.abs(nums[i] - nums[j]) == k)
                {
                    counter++;
                }
            }
        }
        return counter / 2;
    }
}
