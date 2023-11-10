package Question_137;
import java.util.HashMap;
// SOLVED //
public class Solution 
{
    public static HashMap<Integer, Integer> numberDictionary = new HashMap<>();

    public static int singleNumber(int[] nums)
    {
        fillDictionary(nums);

        for (HashMap.Entry<Integer, Integer> entry : numberDictionary.entrySet()) 
        {
            int key = entry.getKey();
            int value = entry.getValue();
            
            //System.out.println("Key: " + key + ", Value: " + value);
            
            if (value == 1) 
            {
                numberDictionary.clear();
                return key;
            }
        }
        numberDictionary.clear();
        return nums[0];
    }

    private static void fillDictionary(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) 
        {
            numberDictionary.put(nums[i], numberDictionary.getOrDefault(nums[i], 0) + 1);
        }
    }
}