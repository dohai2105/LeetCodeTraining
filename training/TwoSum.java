
import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/

class TwoSum {
    public static void main(String[] args) {
        Common.FastReader fr=new Common.FastReader();
        while(true)  {
            int[] result = twoSum(fr.nextArrayInt(),fr.nextInt());

            //Print result
            System.out.println(Arrays.toString(result));
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}