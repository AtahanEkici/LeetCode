package Question_206;
import Question_2.ListNode;
import java.util.ArrayList;
// Accepted >> https://leetcode.com/problems/reverse-linked-list/submissions/897444960/ //
public class Solution
{
    public ListNode reverseList(ListNode head) 
    {
        ListNode reversed = null,temp = null;
        ArrayList<Integer> values = new ArrayList<>();
        int index = 0;
        
        while(head != null)
        {
            values.add(head.val);
            head = head.next;
            index++;
        }
        
        for(int i=(values.size()-1);i>=0;i--)
        {
            int value = values.get(i);
            
            if(reversed == null)
            {
                reversed = new ListNode(value);
                temp = reversed;
            }
            else
            {
                reversed.next = new ListNode(value);
                reversed = reversed.next;
            }
        }
        return temp;
    }
}
