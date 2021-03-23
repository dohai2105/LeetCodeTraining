package easy;

public class TwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        if (length1 > length2) { // to ensure m<=n
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = length1; length1 = length2; length2 = tmp;
        }

        if(length1 == 1 && length2 == 1) return (nums1[0] + nums2[0])/2.0;

        if(length1 == 0) return (length2 % 2  != 0) ? nums2[length2/2] : (nums2[length2/2-1] + nums2[length2/2])/2.0;

        if(length2 == 0) return (length1 % 2  != 0) ? nums2[length1/2] : (nums2[length1/2-1] + nums2[length1/2])/2.0;

        int i = length1/2;
        int j = (length1 + length2 + 1) /2 - i;

        return findMedian(nums1, i, length1, nums2, j, length2);
    }

    public static double min (double a,double b) {
        return a <= b ? a : b;
    }

    public static double max (double a,double b) {
        return a >= b ? a : b;
    }

    public static double findMedian(int[] nums1, int i, int length1, int[] nums2, int j, int length2) {
         int nextI = 0;
        int nextJ = 0;
        if (j > 0 && i < length1 && nums2[j - 1] > nums1[i]) {
            nextI = i + 1;
            nextJ = j - 1;
        } else if (i > 0 && j < length2 && nums1[i - 1] > nums2[j]) {
            nextI = i - 1;
            nextJ = j + 1;
        } else {
            double maxLeft = 0;
            if (j == 0) {
                maxLeft = nums1[i - 1];
            } else if(i==0){
                maxLeft = nums2[j - 1];
            } else {
                maxLeft = max(nums1[i - 1], nums2[j - 1]);
            }
            if ((length1 + length2) % 2 > 0) return maxLeft;

            // int minRight = nums1[i+1] < nums2[j + 1] ? nums1[i + 1] : nums2[j + 1];
            double minRight = 0;
            if(i == length1) {
                minRight = nums2[j];
            } else if(j == length2) {
                minRight = nums1[i];
            } else {
                minRight = min(nums1[i], nums2[j]);
            }
            return (maxLeft + minRight) / 2.0;
            
        }
        return findMedian(nums1, nextI, length1, nums2, nextJ, length2);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2,3};
        double resutl = findMedianSortedArrays(nums1, nums2);
        System.out.println(resutl);
    }

}
