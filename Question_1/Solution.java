package Question_1;

import java.util.Arrays;

public class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int first=0,last=0;
        //int counter = 1;

        for(int i = 0 ;i < nums.length;i++)
        {
            first = nums[i];

            for(int j=i+1;j<nums.length;j++)
            {
                last = nums[j];
                //System.out.println("First:"+first+" Last: "+last+"\n");
                if(first + last == target)
                {
                    int[] array = {i,j};
                    String output = Arrays.toString(array);
                    System.out.println(output);
                    return array;
                }
            }
            //System.out.println(""+counter+++"");
        }
        System.out.println("Not found");
        return null;
    }
}
