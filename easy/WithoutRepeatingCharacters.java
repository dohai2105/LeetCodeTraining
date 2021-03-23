package easy;

import java.util.HashSet;
import java.util.Set;

public class WithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.trim().isEmpty()) return 1;

        Set<Character> countRepeatSet = new HashSet<Character>();
        int max = 0;
        char c;
        for(int i = 0; i < s.length(); i++)
        {
            countRepeatSet.clear();
            for(int j=i; j<s.length(); j++) {
                c = s.charAt(j);
                boolean isDuplicate = countRepeatSet.add(c);
                if(!isDuplicate) break;
           }
           if(max < countRepeatSet.size()) {
                max = countRepeatSet.size();
           }
           if(max > (s.length()-i-1)) break;
        }
        return max;
    }
    public static void main(String[] args) {
        lengthOfLongestSubstring("wobgrovw");
    }
}