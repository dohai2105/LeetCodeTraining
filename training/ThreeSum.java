

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> rs = new ArrayList<>();

        // sort array
        Arrays.sort(nums);

        int i=0, j=0, k=0;
        int length=nums.length;
        while(i<length-2){
            if(i>0 && nums[i] == nums[i-1]) {
                i++;
                continue;
            }
            j=i+1;
            k=length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum==0) rs.add(Arrays.asList(nums[i],nums[j],nums[k]));
                if(sum<=0) {
                    j++;
                    while(j>0&&j<length-1&&nums[j]==nums[j-1]) j++;
                }
                if(sum>=0) {
                    k--;
                    while(k>0&&k<length-1&&nums[k]==nums[k+1]) k--;
                }
            }

            i++;
        }

        return rs;
    }

    public static void main(String []args){
        threeSum(new int[]{-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0});
    }
}
