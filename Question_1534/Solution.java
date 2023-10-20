package Question_1534;
// SOLVED //
public class Solution 
{
    public int countGoodTriplets(int[] arr, int a, int b, int c)
    {
        int array_len = arr.length;
        int counter = 0;
        
        for(int i=0;i<array_len;i++)
        {
            for(int j=i+1;j<array_len;j++)
            {
                for(int k=j+1;k<array_len;k++)
                {
                    if(0 <= i && j < k && k < array_len)
                    {
                        if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k])<= b && Math.abs(arr[i] - arr[k]) <=  c)
                        {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter; 
    }
}
