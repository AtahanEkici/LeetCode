package Question_21;

import Question_2.ListNode;

public class Solution 
{
    public static int getLength(ListNode list)
    {
        int counter = 0;
        
        while(list != null)
        {
            list = list.next;
            counter++;
        }
        
        return counter;
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        int counter1 = getLength(list1);
        int counter2 = getLength(list2);
        
        if(list1 == null && list2 == null) {return null;}
        
        ListNode merged = new ListNode();
        ListNode merged_temp = merged;
        
        for(int i=0;i<(counter1 + counter2);i++)
        {
            if(list1 == null && list2 == null)
            {
                break;
            }
            else if(list1 == null)
            {
                merged_temp.val = list2.val;
                list2 = list2.next;
            }
            else if(list2 == null)
            {
                merged_temp.val = list1.val;
                list1 = list1.next;
            }
            else if(list1.val > list2.val)
            {
                merged_temp.val = list2.val;
                list2 = list2.next;
            }
            else
            {
                merged_temp.val = list1.val;  
                list1 = list1.next;
            }
            
            if(i != (counter1 + counter2 - 1))
            {
                merged_temp.next = new ListNode();
                merged_temp = merged_temp.next;
            } 
        }
        return merged;
    }
}