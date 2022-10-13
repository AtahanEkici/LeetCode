package Question_3;

import java.util.ArrayList;

public class Solution 
{
    public static int lengthOfLongestSubstring(String s) 
    {
        ArrayList<String> substrings = new ArrayList<>();
        ArrayList<Integer> dublicate_count = new ArrayList<>();
        //ArrayList<String> max_dublicates = new ArrayList<>();
        
        int stringLenght = s.length();
        
        if(stringLenght == 1) {return 1;}
        else if(stringLenght <= 0) {return 0;}
        
        String current_selected_substring;
        
        // Find all substring somehow //
       for (int i = 0; i<stringLenght; i++)
       {
           for (int j=i+1;j<=stringLenght; j++) 
           {
                substrings.add(s.substring(i,j));
           }
        }
       
       for(int i=0;i<substrings.size();i++) // initialize dublicates' counters //
       {
           dublicate_count.add(0);
       }
       
       for(int i=0;i<substrings.size();i++) // Find dublicates along the string //
       {
           current_selected_substring = substrings.get(i);
           //System.out.println(current_selected_substring);
           for(int j=0;j<substrings.size();j++)
           {
               if(substrings.get(j) == null ? current_selected_substring == null : substrings.get(j).equals(current_selected_substring))
               {
                   dublicate_count.set(j,(dublicate_count.get(j)+1));
               }
               //System.out.println("Index: "+j+" Value: "+dublicate_count.get(j)+"");
           }
       }
       
       int maximum = Integer.MIN_VALUE;
       
       for(int i=0;i<dublicate_count.size();i++) // find the maximum number //
       {
           int temp = dublicate_count.get(i);
           
          if(temp > maximum)
          {
            maximum = temp;
          }
          System.out.print(""+maximum+",");
       }
       
       /*
       for(int i=0;i<dublicate_count.size();i++) // find maximum dublicates //
       {
           if(dublicate_count.get(i) == maximum)
           {
               max_dublicates.add(substrings.get(i));
           }
       }
       
       int result = Integer.MIN_VALUE;
       
       for(int i=0;i<max_dublicates.size();i++)
       {
           if(max_dublicates.get(i).length() > result)
           {
               result = max_dublicates.get(i).length();
           }
       }
*/
       System.out.println(substrings);
       maximum--;
       System.out.println("\nDublicate Count: "+dublicate_count+"");
       System.out.println(maximum);
       return maximum;
    }
}
