package Question_67;
// Given two binary strings a and b, return their sum as a binary string. //
public class Solution 
{
    public static String addBinary(String a, String b) 
    {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        int temp = sum;
        
        while(sum > 0)
        {
            System.out.println(sum % 10);
            
            if((sum % 10) > 1)
            {
                return calculateBinary(temp);
            }
            
            sum /= 10;
        }
        return String.valueOf(temp);
    }
    public static String calculateBinary(int number)
    {
         return "";
    }
}
