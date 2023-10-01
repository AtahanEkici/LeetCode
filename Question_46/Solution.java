package Question_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Question : Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order. //
public class Solution 
{
    public static List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        String numbers = GetAllNumbers(nums);
        String[] clipped = numbers.split(",");
        System.out.println(Arrays.toString(clipped));
        return result;
    }
    
    private static String GetAllNumbers(int[] nums)
    {
        String numbers = "";
        
        for(int i=0;i<nums.length;i++)
        {
            numbers += nums[i] + ",";
        }
        System.out.println(numbers);
        return numbers;
    }

}
