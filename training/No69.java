public class No69 {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1; 
        int right = x;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left)/2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {// Found the result
                return mid;
            } else if (mid > x/mid) {
                right = mid;
            } else if (mid < x/mid) {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String []args) {
        mySqrt(8);
    }
}
