package Question_2475;
// SOLVED //
public class Solution 
{
    public int unequalTriplets(int[] nums)
    {
        int array_len = nums.length;
        int counter = 0;

        for(int i=0;i<array_len;i++)
        {
            for(int j=i+1;j<array_len;j++)
            {
                for(int k=j+1;k<array_len;k++)
                {
                    if((i < j) && (j < k) && (k < array_len))
                    {
                        if(nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k])
                        {
                            counter++;
                        }                       
                    }
                }
            }
        }
        return counter;
    }
}
