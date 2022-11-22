package Question_34;

public class Solution 
{
    public static int[] searchRange(int[] nums, int target) 
    {
        int[] result = {-1,-1};
        int counter = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                //System.out.println(i);
                
                if(counter == 0)
                {
                    result[0] = i;
                    counter++;
                }
                else
                {
                    result[1] = i;
                }
            }
        }
        if(counter != 0 && result[1] == -1){result[1] = result[0];}
        return result;
    }
}
