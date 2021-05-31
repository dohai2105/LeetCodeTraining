public class No53 {

    public static int maxSubArray(int[] A) {
        int currentMaxSum = A[0];
        int lastMaxSum = A[0];
        for (int i = 1; i< A.length; i++) {
            currentMaxSum = Math.max(currentMaxSum + A[i], A[i]);
            lastMaxSum = Math.max(currentMaxSum, lastMaxSum);
        }

        return lastMaxSum;
    }
    public static void main(String[] args) {
        int rs = maxSubArray(new int[]{1});
        System.out.print(rs);
    }
}
