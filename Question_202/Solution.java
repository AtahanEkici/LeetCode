package Question_202;

import java.util.ArrayList;

public class Solution
{
    public static boolean isHappy(int n) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        
        while(n > 1)
        {
            list.add(n % 10);
            n = n / 10;
        }
        
        for(int i=0;i<list.size();i++)
        {
            int value = list.get(i);
            sum += Math.pow(value, 2);
        }
        
        System.out.println(list);
        
        return false;
    }
    private int[] digits(int number)
    {
        int digit_counter = 1;
        
        while(number > 1)
        {
            number /= 10;
            digit_counter++;
        }
        int[] _digits = new int[digit_counter];
        
        return null;
    }
}
