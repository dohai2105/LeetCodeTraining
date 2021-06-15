import java.util.HashSet;

public class No217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int integer : nums) {
            if(hs.contains(integer)){
                return true;
            }else {
                hs.add(integer);
            }
        }    
        return false;
    } 
}
