import java.util.HashMap;
import java.util.Map;

public class No169 {
    public static int majorityElement(int[] nums) {
        if (nums.length == 0) return 0;
        int length = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i : nums) {
            Integer count = hm.get(i);
            count = count == null ? 1 : count + 1;
            if(count > length/2) {
                return i;
            }
            hm.put(i, count);
        }
        return 0;
    }

    public static void main(String []args) {
        int []inputList = {3,2,3};
        majorityElement(inputList);
    }
}
