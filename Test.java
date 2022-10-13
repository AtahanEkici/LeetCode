
import Question_1.Solution;
import Question_2.ListNode;
import static Question_2.ListNode.TraverseNode;
import static Question_2.Solution.addTwoNumbers;
import static Question_3.Solution.lengthOfLongestSubstring;
import static Question_4.Solution2.findMedianSortedArrays;
import static Question_7.Solution.reverse;
import static Question_8.Solution.myAtoi;

public class Test 
{
    public static void main(String[] args)
    {
        Q8();
    }
    
    public static void Q8()
    {
        String s = "words and 987";
        int result = myAtoi(s);
        System.out.println(result);
    }
    
    public static void Q4()
    {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        
        findMedianSortedArrays(nums1,nums2);
    }
    
    public static void Q3()
    {
        lengthOfLongestSubstring("bbbbb");
    }
    
    public static void Q7()
    {
        int reversed = reverse(1534236469);
        System.out.println("Returned value: "+reversed+"");
    }
    
    public static void Q2()
    {
        /*
        ListNode ln = new ListNode(0);
        ListNode ln2 = new ListNode(0);
        addTwoNumbers(ln,ln2);
        */
        ListNode ln = new ListNode(5);
        ListNode temp1 = ln;
        temp1.next = new ListNode(6);
        temp1 = temp1.next;
        temp1.next = new ListNode(4);
        temp1 = temp1.next;
        
        ListNode ln4 = new ListNode(1);
        ListNode temp = ln4;
        temp.next = new ListNode(0);
        temp = temp.next;
        temp.next = new ListNode(0);
        temp = temp.next;
        
        TraverseNode(ln);
        TraverseNode(ln4);
        
        addTwoNumbers(ln,ln4);
        
        /*
        int deneme = 702;
        int sonuç = 0;
        
        for(int i=0;deneme>0;i++)
        {
            System.out.println(""+deneme%10+"");
            deneme = deneme / 10;
        }
*/
    }
    public static void Q1()
    {
       int[] nums = {2,7,11,15};
       int[] nums2 = {3,2,4};
       int[] nums3 = {3,3};
       Solution sol = new Solution();
       sol.twoSum(nums, 9);
       sol.twoSum(nums2, 6);
       sol.twoSum(nums3, 6); 
    }
    
}

