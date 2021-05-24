

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class No26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int temp = nums[0];
        int newLength = 0;
        for(int i = 1; i < nums.length; i++) {
            if(temp != nums[i]){
                temp = nums[i];
                newLength ++;
                nums[newLength] = nums[i];
            }
        }
        return newLength + 1;
    }
}
