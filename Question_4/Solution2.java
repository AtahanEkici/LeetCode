package Question_4;

import java.util.Arrays;

public class Solution2 
{
    public static double calculate_median(int[] array)
    {
        double median = 0.0;
        
        if (array.length % 2 == 0)
        {
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        }    
        else
        {
            median = (double)array[array.length/2];
        }
        
        return median;
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        boolean first_empty = false;
        boolean second_empty = false;
        
        if(nums1.length == 0) { first_empty = true; }
        if(nums2.length == 0) { second_empty = true; }
        
        double result = 0.0;
        
        if(first_empty) // if the first one is empty calculate only the second one //
        {
            return calculate_median(nums2);
        }
        else if(second_empty) // if the second one is empty calculate only the first one //
        {
            return calculate_median(nums1);
        }
        
        int[] nums3 = new int[(nums1.length+nums2.length)];
        
        int first_counter = 0;
        int second_counter = 0;
        
        for(int i=0;i<(nums1.length+nums2.length);i++)
        {
            if(nums1.length > first_counter && nums2.length > second_counter) // nums1 and nums2 is not empty at the given index //
            {
                if(nums1[first_counter] < nums2[second_counter])
                {
                    nums3[i] = nums1[first_counter];
                    first_counter++;
                }
                else 
                {
                    nums3[i] = nums2[second_counter];
                    second_counter++;
                }
            }
            else if(nums1.length > first_counter && nums2.length <= second_counter) // nums1 is OK but the nums2 is null at the index
            {
                nums3[i] = nums1[first_counter];
                first_counter++;
            }
            else if(nums1.length <= first_counter && nums2.length > second_counter) // nums2 is OK but the nums1 exceeded its array dimension //
            {
                nums3[i] = nums2[second_counter];
                second_counter++;
            }
            else 
            {
                System.out.println("Error");
                System.out.println("First Counter: "+first_counter+"\nSecond Counter: "+second_counter+"\nIndex: "+i+"");
                break;
            }
        }
        
        System.out.println(Arrays.toString(nums3));
        
        double value = calculate_median(nums3);
        System.out.println(value);
        System.out.println();
        return value;
    }
}
