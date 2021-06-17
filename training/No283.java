public class No283 {
//     Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
    public void moveZeroes(int[] nums) {
        int tmpIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[tmpIdx] = nums[i];
                tmpIdx ++;
            }
        }
        for (int i = tmpIdx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
