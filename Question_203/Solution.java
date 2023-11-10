package Question_203;

import Question_2.ListNode;

public class Solution
{
    public static ListNode removeElements(ListNode head, int val) 
    {
        ListNode head_temp = head;
        ListNode iter_before = head_temp;
        ListNode iter = head_temp;
        int counter = 0;
        
        while(iter != null)
        {
            if(iter.val == val)
            {
                counter++;
                iter_before.next = iter.next;
            }
            iter_before = iter;
            iter = iter.next; 
        }
        System.out.println(counter);
        return head_temp;
    }
    public ListNode findTheNextSuitableListNode(ListNode head, int val)
    {
        ListNode iter = head;
        
        while(iter != null)
        {
            if(iter.val != val)
            {
                return iter;
            }
        }
        return null;
    }
}
