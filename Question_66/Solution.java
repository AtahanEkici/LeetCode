package Question_66;

public class Solution
{         
    public static int[] plusOne(int[] digits) 
    {
        for(int i=(digits.length - 1);i>=0;i--)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;

                if(i == 0)
                {
                    int[] result = new int[(digits.length + 1)];
                    System.arraycopy(digits, 0, result, 1, 1);
                    result[0] = 1;
                    return result;
                }
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }
    
    public static void printArray(int[] array)
    {
        System.out.print("[");
        
        for(int i=0;i<array.length;i++)
        {
            System.out.print(""+array[i]+",");
        }
        
        System.out.print("]");
    }
}