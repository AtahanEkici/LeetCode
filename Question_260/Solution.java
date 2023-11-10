package Question_260;

import java.util.HashMap;
// SOLVED //
public class Solution 
{
    public static HashMap<Integer, Integer> numberDictionary = new HashMap<>();
    public static int[] result;
    
    public static int[] singleNumber(int[] nums)
    {
        numberDictionary.clear();
        result = new int[2];
        fillDictionary(nums);
        
        boolean isFirst = true;
        
        for (HashMap.Entry<Integer, Integer> entry : numberDictionary.entrySet()) 
        {
            int key = entry.getKey();
            int value = entry.getValue();
            
            System.out.println("Key: " + key + ", Value: " + value);
            
            if (value == 1) 
            {
                if(isFirst)
                {
                    result[0] = key;
                    isFirst = false;
                }
                else
                {
                    result[1] = key;
                    return result;
                }
            }
        }
        return result;
    }
    
    private static void fillDictionary(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) 
        {
            numberDictionary.put(nums[i], numberDictionary.getOrDefault(nums[i], 0) + 1);
        }
    }
}