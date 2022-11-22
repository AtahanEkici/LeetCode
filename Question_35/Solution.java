package Question_35;

public class Solution 
{
    public static int searchInsert(int[] nums, int target)
    {
        int preferred_index = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
            else if(nums[i] < target)
            {
                //System.out.println("geçti: "+preferred_index+"");
                
                preferred_index = (i + 1);
            }
            else 
            {
                break;
            }
        }
        return preferred_index;
    }
}
