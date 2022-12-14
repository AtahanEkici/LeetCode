
import Question_1.Solution;
import static Question_11.Solution.maxArea;
import static Question_17.Solution.letterCombinations;
import static Question_18.Solution.fourSum;
import static Question_19.Solution.removeNthFromEnd;
import Question_2.ListNode;
import static Question_2.ListNode.TraverseNode;
import static Question_2.Solution.addTwoNumbers;
import static Question_20.Solution.isValid;
import static Question_21.Solution.mergeTwoLists;
import static Question_3.Solution.lengthOfLongestSubstring;
import static Question_34.Solution.searchRange;
import static Question_35.Solution.searchInsert;
import static Question_4.Solution2.findMedianSortedArrays;
import static Question_7.Solution.reverse;
//import static Question_8.Solution.myAtoi;
import static Question_8.Solution2.myAtoi;
import static Question_66.Solution.plusOne;
import static Question_66.Solution.printArray;
import static Question_75.Solution.sortColors;

public class Test 
{
    public static void main(String[] args)
    {
        Q35();
    }
    
    private static void Q35()
    {
        int nums[] = {1,3,5,6};
        int target = 2;
        int result = searchInsert(nums,target);
        System.out.println(result);
    }
    
    private static void Q34()
    {
        int[] nums = {5,7,7,8,8,10};
        int[] result = searchRange(nums,8);
        printArray(nums);
        printArray(result);
    }
    
    private static void Q20()
    {
        String test = "()[]{}";
        boolean result = isValid(test);
        System.out.println(result);
    }
    
    private static void Q75()
    {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        printArray(nums);
    }
    
    private static void Q66()
    {
        int[] test = {1,7,8};
        int[] result = plusOne(test);
        printArray(result);
    }
    
    private static void Q17()
    {
        System.out.println(letterCombinations("23"));
    }
    
    public static void Q18()
    {
        int[] array = new int[]{1,0,-1,0,-2,2};
        fourSum(array,0);
    }
    
    public static void Q46()
    {
        
    }
    
    public static void Q14()
    {
        
    }
    
    public static void Q21()
    {
        ListNode ln = new ListNode(1);
        ListNode temp1 = ln;
        temp1.next = new ListNode(2);
        temp1 = temp1.next;
        temp1.next = new ListNode(4);
        temp1 = temp1.next;
        
        ListNode ln4 = new ListNode(1);
        ListNode temp = ln4;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        
        ListNode answer = mergeTwoLists(ln,ln4);
        
        TraverseNode(ln);
        TraverseNode(ln4);
        TraverseNode(answer);
    }
    
    public static void Q11()
    {
        int[] array = new int[]{1,8,6,2,5,4,8,3,7};
        
        int Result = maxArea(array);
        
        System.out.println("Result: " +Result);
    }
    
    public static void Q19()
    {
        ListNode ln = new ListNode(1);
        ListNode temp1 = ln;
        temp1.next = new ListNode(2);
        temp1 = temp1.next;
        /*
        temp1.next = new ListNode(3);
        temp1 = temp1.next;
        temp1.next = new ListNode(4);
        temp1 = temp1.next;
        temp1.next = new ListNode(5);
        temp1 = temp1.next;
        */
        
        
        TraverseNode(ln);
        
        ListNode Answer = removeNthFromEnd(ln,2);
        
        TraverseNode(Answer);
    }
    
    public static void Q8()
    {
        String s = "    3.14159";
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
        int sonu?? = 0;
        
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

