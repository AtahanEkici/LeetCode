package Question_263;
// SOLVED //
public class Solution 
{
    public static boolean isUgly(int n) 
    {
        if(n == 1){return true;}
        else if(n == 0){return false;}
        
        int stored_value = n;
        
        while( stored_value % 2 == 0)
        {
            stored_value = (stored_value / 2);
        }
        
        while(stored_value % 3 == 0)
        {
            stored_value = (stored_value / 3);
        }
        
        while(stored_value % 5 == 0)
        {
            stored_value = (stored_value / 5);
        }
        
        return stored_value == 1;
    }
}

