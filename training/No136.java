import java.util.HashMap;

public class No136 {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> numbersHashMap = new HashMap<>();
        int NUMBER1 = 1;

        for (int i = 0; i < nums.length; i++) {
            if(numbersHashMap.containsKey(nums[i])) {
                numbersHashMap.remove(nums[i]);
            } else {
                numbersHashMap.put(nums[i], NUMBER1);
            }
        }
 
        return numbersHashMap.entrySet().iterator().next().getKey();
    }




}
// Input: nums = [4,1,2,1,2]
// Output: 4
// O(N)—Linear Time:
// O(log(n)) — Logarithmic Time:
// O(N²) — Quadratic Time:
// O(2^N) — Exponential Time
// O(1) — Constant Time:
