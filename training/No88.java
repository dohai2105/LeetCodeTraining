public class No88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums2.length == 0) return;
        int i = m - 1; 
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if(j < 0 || (i >=0 && nums1[i] > nums2[j])) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
// [1,2,3,0,0,0]
// 3
// [2,5,6]
// 3