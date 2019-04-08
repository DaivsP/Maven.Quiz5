package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> answer = new HashSet<>();
        getAllSubstring(string, answer);
        return answer.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> answer = new HashSet<>();
        getAllSubstring(string1, set1);
        getAllSubstring(string2, set2);
        for (String string : set1) {
            for (String string3 : set2) {
                if (string.equals(string3)){
                    answer.add(string);
                }
            }
        }
        return answer.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] answer = getCommonSubstrings(string1, string2);
        String temp = answer[0];
        for (String string : answer){
            if (temp.length() < string.length()){
                temp = string;
            }
        }
        return temp;
    }

    private static void getAllSubstring(String string, Set<String> answer) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                answer.add(string.substring(i, j));
            }
        }
    }
}
