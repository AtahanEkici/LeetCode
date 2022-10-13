package Question_2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution 
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int[] first = new int[100];
        int[] last = new int[100];
        
        int counter = 0;
        BigInteger f = BigInteger.ZERO;
        BigInteger l = BigInteger.ZERO;
        BigInteger solution = BigInteger.ZERO;
        
        ListNode ln = null;
        
        while(l1 != null)
        {
            first[counter] = l1.val;
            l1 = l1.next;
            counter++;
        }
        
        counter = 0;
        
        while(l2 != null)
        {
            last[counter] = l2.val;
            l2 = l2.next;
            counter++;
        }
        
        //System.out.println("First: "+Arrays.toString(first)+" Last: "+Arrays.toString(last)+"");
        
        //System.out.println(first.length-1);
        
        for(int i=first.length-1;i>=0;i--)
        {
            Double d = (first[i] * Math.pow(10, i));
            BigInteger double_exact = BigDecimal.valueOf(d).toBigIntegerExact();
            BigInteger temp = BigInteger.ZERO;
            temp = temp.add(double_exact);
            f = f.add(temp);
            //System.out.println(f);
            //f = f.add(temp);
            //f += ;(first[i] * Math.pow(10, i))
            //System.out.println(first[i]);
        }
        
        for(int j=last.length-1;j>=0;j--)
        {
            BigInteger temp = BigInteger.ZERO;
            Double value = (last[j] * Math.pow(10, j));
            BigInteger double_exact = BigDecimal.valueOf(value).toBigIntegerExact();
            temp = temp.add(double_exact);
            l = l.add(temp);
            //System.out.println(l);
            //l += last[j] * Math.pow(10, j); 
        }
        //System.out.println("F:"+f.toString()+" L: "+l.toString()+"");
        
        //solution = f + l;
        BigInteger sol_temp = f.add(l);
        //solution = solution.add(f);
        solution = sol_temp;
       
        //System.out.println("Solution: "+solution+"");
        
        ListNode root = ln;
        ListNode temp = ln;
        
        if(solution.intValue() == 0) // Special Case //
        {
            return new ListNode(0);
        }
        
        for(int k =0;solution.compareTo(BigInteger.ZERO) == 1;k++)
        { 
            BigInteger dividebyten = BigInteger.valueOf(10);
            if(root == null)
            {
                int flag = solution.mod(dividebyten).intValueExact();
                root = new ListNode(flag); 
                //System.out.println("Flag: "+flag+"");
                temp = root;
            }           
            else
            {
               int flag2 = (solution.mod(dividebyten)).intValueExact();
               //System.out.println("Flag2: "+flag2+"");
               temp.next = new ListNode(flag2); 
               temp = temp.next;
            }  
            solution = solution.divide(BigInteger.valueOf(10));
            //System.out.println("Solution: "+solution+"");
        }
        ln = root;
        //TraverseNode(ln);
        return ln; 
    }
}
