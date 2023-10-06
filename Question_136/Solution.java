package Question_136;
import java.util.ArrayList;

public class Solution 
{
   public static int singleNumber(int[] nums) 
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        ArrayList numbers = new ArrayList<Integer>();
        //ArrayList discards = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            
        }
    }
   public static boolean CheckListForSameValue(ArrayList list, int value)
   {
       for(int i=0;i<list.size();i++)
       {
           if(list.get(i).equals(value))
           {
               return true;
           }
       }
       return false;
   }
}
