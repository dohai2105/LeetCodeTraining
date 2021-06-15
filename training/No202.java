import java.util.HashSet;

class No202 {
    public static boolean isHappy(int n) {
        int sum = n;
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(sum)) {
            set.add(sum);
            int tmp = 0;
            while(sum > 0) {
                tmp += Math.pow(sum%10, 2);
                sum = sum/10;
            }
            sum = tmp;
            if (sum == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        isHappy(19);
    }
}

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1