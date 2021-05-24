

// https://leetcode.com/problems/longest-palindromic-substring/

public class PalindromicSubstring {
    public static String longestPalindrome(String s) {
        int maxSameCount = 0;
        int fromIdx = 0;
        for(int i = 0; i < s.length(); i++) {
            int countSameFromSameStart = countSame(s, i, i);
            int countSameFromDifferentStart = countSame(s, i, i + 1);
            int tempCount = countSameFromSameStart > countSameFromDifferentStart ? countSameFromSameStart : countSameFromDifferentStart;
            if(tempCount > maxSameCount) {
                maxSameCount = tempCount;
                fromIdx = (countSameFromSameStart > countSameFromDifferentStart) ? (i - countSameFromSameStart / 2) : (i - countSameFromDifferentStart / 2 + 1);

            }
        }
        String rs = s.substring(fromIdx, fromIdx + maxSameCount);
        return rs;
    }

    public static int countSame(String s, int i, int j) {
        for(; i >= 0 && j < s.length(); i--, j++) {
            if (s.charAt(i) != s.charAt(j))
                break;
        }
        // because for will run one more time when break
        return j - i - 2 + 1;
    }
    // public static String longestPalindrome(String s) {
    //     String max = "";
    //     for (int i = 0; i < s.length(); i++) {
    //         String s1 = extend(s, i, i), s2 = extend(s, i, i + 1);
    //         if (s1.length() > max.length()) max = s1;
    //         if (s2.length() > max.length()) max = s2;
    //     }
    //     return max;
    // }
    
    // private static String extend(String s, int i, int j) {
    //     for (; 0 <= i && j < s.length(); i--, j++) {
    //         if (s.charAt(i) != s.charAt(j)) break;
    //     }
    //     return s.substring(i + 1, j);
    // }

    public static void main (String[] args) {
        String rs = longestPalindrome("baab");
        System.out.println(rs);
    }
}
