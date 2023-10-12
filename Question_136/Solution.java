package Question_136;

// SOLVED //
public class Solution 
{
    public static int singleNumber(int[] nums) 
    {
        int counter = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] == nums[i])
                {
                    if(j != i)
                    {
                        counter = 0;
                        break;
                    }
                }
                else
                {
                    counter++;
                }
            }
            if(counter == nums.length-1)
            {
                counter = 0;
                return nums[i];
            }
        }
        return 0;
    }
}
  
        

