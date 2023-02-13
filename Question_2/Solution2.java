package Question_2;

import java.util.Arrays;

public class Solution2 
{
    public static int findMax(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public static int findLenght(ListNode listnode)
    {
        int lenght = 0;
        
        while(listnode != null)
        {
            lenght++;
            listnode = listnode.next;
        }
        return lenght;
    }
    
    public static int[] toArray(ListNode listnode)
    {
        int[] array = new int[findLenght(listnode)];
                
        for(int i=0;listnode != null;i++)
        {
            array[i] = listnode.val;
            listnode = listnode.next;
        }
        return array;
    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int[] first = toArray(l1);
        int[] second = toArray(l2);
        boolean overflow = false;
        
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        
        int max_lenght = findMax(first.length,second.length);
        int first_index = first.length - 1;
        int second_index = second.length - 1;
        
        int[] result_array = new int[max_lenght+1];
        
        for(int i=max_lenght-1;i>0;i--)
        {
            int first_segment = first[first_index];
            int second_segment = second[second_index];
            
            int result = first_segment + second_segment;
            
            if(overflow)
            {
                result++;
            }
            
            if(result >= 10)
            {
                
            }
        }
        
        return null;
    }
}
