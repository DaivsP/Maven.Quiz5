package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> answer = new HashSet<>();
        for(int i=0; i <= string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                if (isPalindrome(string.substring(i, j + 1))){
                    answer.add(string.substring(i, j + 1));
                }
            }
        }
        return answer.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        Boolean answer = false;
        if (string.equals(reverseString(string)))
        answer = true;
        return answer;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
