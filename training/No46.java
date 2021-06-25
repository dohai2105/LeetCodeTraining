import java.util.ArrayList;
import java.util.List;

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

public class No46 {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();
        boolean []isUsed = new boolean[nums.length];
        backtrack(outerList, innerList, isUsed, nums);
        return outerList;
    }

    public void backtrack(List<List<Integer>> outerList, List<Integer> innerList, boolean []isUsed, int[] nums) {
        if (nums.length == innerList.size()) {
            outerList.add(new ArrayList<>(innerList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isUsed[i] == true) continue;
            innerList.add(nums[i]);
            isUsed[i] = true;
            backtrack(outerList, innerList, isUsed, nums);
            innerList.remove(innerList.size() - 1);
            isUsed[i] = false;
        }
    }
}

