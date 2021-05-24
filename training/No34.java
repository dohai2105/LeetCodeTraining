
public class No34 {
    private static final int NOT_FOUND_VALUE = -1;
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirstPosition(nums, target, 0, nums.length - 1, NOT_FOUND_VALUE);
        int last = findLastPosition(nums, target, 0, nums.length - 1, NOT_FOUND_VALUE);
        return new int[]{first,last};
    }

    public static int findFirstPosition(int[] nums, int target, int start, int end, int foundIdx){
        if(end < start) return foundIdx;
        int tmpIdx = (start + end)/2;

        if(nums[tmpIdx] == target) foundIdx = tmpIdx;
        if(nums[tmpIdx] >= target) 
            end = tmpIdx - 1;
        else
            start = tmpIdx + 1;

        return findFirstPosition(nums, target, start, end, foundIdx);
    }

    public static int findLastPosition(int[] nums, int target, int start, int end, int foundIdx){
        if(end < start) return foundIdx;
        int tmpIdx = (start + end)/2;

        if(nums[tmpIdx] == target) foundIdx = tmpIdx;
        if(nums[tmpIdx] > target) 
            end = tmpIdx - 1;
        else
            start = tmpIdx + 1;

        return findLastPosition(nums, target, start, end, foundIdx);
    }
    
    public static void main(String []args) {
        int[] intArray = new int[]{ 5,7,7,8,8,10 }; 
        int []rs = searchRange(intArray, 8);
        System.out.println(rs[0] + "  " + rs[1]);
    }

}


// 5,7,7,8,8,10
// 8

// 0 5

// 2 5
// 5 7   7 8 8 10

// 2 3