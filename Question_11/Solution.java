package Question_11;

public class Solution
{
    public static int max = Integer.MIN_VALUE;
    
    public static int getMin(int a,int b)
    {
        if(a > b)
        {
            return b;
        }
        else 
        {
            return a;
        }
    }
    
    public static int maxArea(int[] height) 
    {
        int counter = 0;
        
        for(int i=0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                counter++;
                int distance = j-i;
                int minimal = getMin(height[j],height[i]);
                int result = distance * minimal;
                
                if(result > max)
                {
                    max = result;
                }
            }
        }
        System.out.println("Counter: "+counter+"");
        return max;
    }
}