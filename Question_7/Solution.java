package Question_7;

import java.util.ArrayList;

public class Solution 
{
    public static int reverse(int x) 
    {
        boolean Is_Negative = false;
        
        int checker = (int)(Math.pow(2, 31));
        
        if(x < 0) 
        {
            Is_Negative = true;
            x = x * -1;
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        long result = 0;
        int counter = 0;
        
        while(x > 0)
        {
           numbers.add(x%10);
           x /= 10; 
           counter++;
        }
        
        counter = numbers.size() - 1;
        
        System.out.println(numbers);
        
        for(int i=0;i<numbers.size();i++)
        {
            result += (long)(numbers.get(i)) * ((long)(Math.pow(10, counter)));
            System.out.println(numbers.get(i));
            System.out.println((int)(Math.pow(10, counter)));
            //System.out.println(result);
            counter--;
        }
        
        System.out.println(result);
        
        if(result >= (checker - 1) || result <= (checker * -1)) {return 0;}
        else if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){return 0;}
        else if(Is_Negative == true) {return (int)(result * -1);}
        else return (int)(result);
    }
}
