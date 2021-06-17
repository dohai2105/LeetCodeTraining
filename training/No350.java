import java.util.ArrayList;
import java.util.HashMap;

public class No350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1Hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int count = nums1Hm.get(nums1[i]) == null ? 1 : nums1Hm.get(nums1[i]) + 1;
            nums1Hm.put(nums1[i], count);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(nums1Hm.containsKey(nums2[i]) && nums1Hm.get(nums2[i]) > 0) {
                nums1Hm.put(nums2[i], nums1Hm.get(nums2[i]) - 1);
                result.add(nums2[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
