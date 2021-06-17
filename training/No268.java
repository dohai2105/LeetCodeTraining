public class No268 {
// Input: nums = [3,0,1]
// Output: 2
    public int missingNumber(int[] nums) {
        int maxNum = nums.length;
        int sum = maxNum*(maxNum + 1)/2;
        for (int i : nums) {
            sum = sum-i;
        }
        return sum;
    }
}
