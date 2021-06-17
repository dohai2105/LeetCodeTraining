import java.util.HashMap;
import java.util.HashSet;

public class No242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char []firstCharArr = s.toCharArray();
        char []secondCharArr = t.toCharArray();
        HashMap<Character, Integer> firstCharHm = new HashMap<>();
        for (char c : firstCharArr) {
            int count = firstCharHm.get(c) == null ? 1 : firstCharHm.get(c) + 1;
            firstCharHm.put(c,count);
        }
        for (char c : secondCharArr) {
            int count = firstCharHm.get(c) == null ? -1 : firstCharHm.get(c) - 1;
            if(count < 0) return false;
            firstCharHm.put(c,count);

        }
        
        return true;
    }

    public static void main(String[] args) {
        isAnagram("rat", "car");
    }
}
