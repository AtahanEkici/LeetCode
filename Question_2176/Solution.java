package Question_2176;
// SOLVED //
public class Solution 
{
    public static int countPairs(int[] nums, int k)
    {
        int counter = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(0 <= i && i < j && j < nums.length)
                {
                    if(nums[i] == nums[j])
                    {
                        if(k == 0) // Arithmetic Operand Exception if k=0 //
                        {
                            continue;
                        }
                        else if((i * j) % k == 0)
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
