package Question_1636;

import java.util.HashMap;
// NOT SOLVED YET //
public class Solution 
{
    public static int[] frequencySort(int[] nums)
    {
        HashMap<Integer, Integer> dictionary = new HashMap<>();
         
        for(int i=0;i<nums.length;i++)
        {
            dictionary.put(nums[i], dictionary.get(nums[i]));
        }
        
        for(int j=0;j<nums.length;j++)
        {
            
        }
        return null;
    }
}
