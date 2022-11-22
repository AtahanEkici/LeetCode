package Question_75;

public class Solution 
{
    public static void sortColors(int[] nums) 
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                zero++;
            }
            else if(nums[i] == 1)
            {
                one++;
            }
            else if(nums[i] == 2)
            {
                two++;
            }
            else
            {
                System.out.println("Error Unexpected Number: "+nums[i]+"");
            }
        }
        
        //int result[] = new int[zero + one + two];
        
        //System.out.println("Zero: "+zero+" One: "+one+" Two: "+two+"");
        
        int index = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(zero != 0)
            {
                nums[index] = 0;
                zero--;
                index++;
            }
            else if(one != 0)
            {
                nums[index] = 1;
                one--;
                index++;
            }
            else if(two != 0)
            {
                nums[index] = 2;
                two--;
                index++;
            }
            else
            {
                System.out.println("Error");
                System.out.println("Zero: "+zero+" One: "+one+" Two: "+two+"");
                break;
            }
        }
    }
}