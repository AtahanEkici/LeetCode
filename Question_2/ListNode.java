package Question_2;

public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    public static void TraverseNode(ListNode l)
    {
        if(l == null)
        {
            System.out.println("Empty");
            return;
        }
        
        while(l != null)
        {
            System.out.print(" "+l.val);
            l = l.next;
        }
        System.out.println();
    }
}