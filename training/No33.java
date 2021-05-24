

public class No33 {
    public int search(int[] nums, int target) {
        int foundIndex = -1;
        for (int i = 0; i<nums.length;i++){
            if(nums[i] == target){
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }
}
