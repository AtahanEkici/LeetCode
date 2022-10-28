package Question_19;

import Question_2.ListNode;

public class Solution 
{
    public static int getLenght(ListNode node)
    {
        int counter = 0;
        
        while(node != null)
        {
            counter++;
            node = node.next;
        }
        
        return counter;
    }
    
    public static ListNode removeNthFromEnd(ListNode head, int n)
    {
        //if(getLenght(head) < n) {return head;}
        if(getLenght(head) == 1 && n == 1) {head = null; return head;}
        
        int counter = 0;
        int destination = getLenght(head) - n;
        
        ListNode root = head;
        ListNode temp = root;
        
        while(temp != null)
        {
            if(counter == (destination-1))
            {
                temp.next = temp.next.next;
                return root;
            }
            else if(counter == destination)
            {
                return temp.next;
            }
            else
            {
                temp = temp.next;
                counter++;
            }
        }
        return root;
    }
}