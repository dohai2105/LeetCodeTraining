import java.util.HashMap;
import java.util.Iterator;

public class No387 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char []inputChars = s.toCharArray();
        for (int i = 0; i < inputChars.length; i++) {
            int count = hm.get(inputChars[i]) == null ? 1 : hm.get(inputChars[i]) + 1;
            hm.put(inputChars[i], count);
        }
        for (int i = 0; i < inputChars.length; i++) {
            if(hm.get(inputChars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
