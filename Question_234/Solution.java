package Question_234;
import Question_2.ListNode;
import java.util.ArrayList;
// >> Accepted: https://leetcode.com/problems/palindrome-linked-list/submissions/897949426/ //
public class Solution 
{
    private ArrayList<Integer> list = new ArrayList<>();
    private int last_index = 0;
    public boolean isPalindrome(ListNode head) 
    {
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        
        last_index = list.size() - 1;
        
        for(int i=0;i<(list.size()/2);i++)
        {
            if(list.get(i) != list.get(last_index))
            {
                return false;
            }
            last_index--;
        }
        return true;
    }
}
