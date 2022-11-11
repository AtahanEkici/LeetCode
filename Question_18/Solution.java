package Question_18;

import java.util.ArrayList;
import java.util.List;

public class Solution <T>
{
    public static List<List<Integer>> fourSum(int[] nums, int target)
    {
        List<List<Integer>> results = new ArrayList<>();
        int counter = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                
            }
        }
        
        return results;
    }

    public List<T> EliminateDublicates(List<T> list)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    list.remove(j);
                }
            }
        }
        return (List<T>) (list);
    }
}
