/**
 * Created by HaMi on 2017-10-02.
 * This program finds the longest subsequence between two strings and returns that subsequence in a new string
 */
public class LongestSubsequence {
    public static void main(String[] args) {
        String a = "abcdeee";
        String b = "acdeeccccc";
        String c = "abcdxyz";
        String d = "xyzabcd";
        String result = longestSub(a, b);
        String result2 = longestSub(c, d);
        System.out.println(result);
        System.out.println(result2);
    }

    public static String longestSub(String str1, String str2) {
        String s = "";
        int i = 0;
        int j = 0;

        if (str1.length() == 0 || str2.length() == 0) {
            return "There is no subsequence.";
        }

        // compare the second string to the first string
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                s = s + str1.charAt(i);
                i++;
                j++;
            } else {
                i++;    // if the two characters don't match then we move to the next char in str1
            }
        }
        return s;
    }
}

