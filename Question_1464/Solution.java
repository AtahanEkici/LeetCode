package Question_1464;
// SOLVED //
public class Solution 
{
    /*
    Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
    */
    public int maxProduct(int[] nums)
    {
        int max_value = 0;int temp_value;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                temp_value = (nums[i]-1)*(nums[j]-1);
            
                if(temp_value > max_value)
                {
                    max_value = temp_value;
                }
            }
            
        }
        return max_value;
    }
}
