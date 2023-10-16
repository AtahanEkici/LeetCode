package Question_17;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    private static final String two = "abc";
    private static final String three = "def";
    private static final String four = "ghi";
    private static final String five = "jkl";
    private static final String six = "mno";
    private static final String seven = "pqrs";
    private static final String eight = "tuv";
    private static final String nine = "wxyz";
    
    public static List<String> getAllUniqueSubset(String str) 
    {      
        return null;
    }
    
    public static List<String> findUniqueSubstrings(String str1, String str2) {
        List<String> uniqueSubstrings = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                for (int len = 1; i + len <= str1.length() && j + len <= str2.length(); len++) {
                    String substring1 = str1.substring(i, i + len);
                    String substring2 = str2.substring(j, j + len);

                    if (!uniqueSubstrings.contains(substring1)) {
                        uniqueSubstrings.add(substring1);
                    }

                    if (!uniqueSubstrings.contains(substring2)) {
                        uniqueSubstrings.add(substring2);
                    }
                }
            }
        }

        return uniqueSubstrings;
    }
}
