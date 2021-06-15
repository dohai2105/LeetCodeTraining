public class No172 {
    public static int trailingZeroes(int n) {
        int NUMBER_5 = 5;
        int square5Tmp = 5;
        int trailingZeroes = 0;
        while (n/square5Tmp > 0) {
            trailingZeroes += n/square5Tmp;
            square5Tmp = square5Tmp * NUMBER_5;
        }

        return trailingZeroes;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }
}

// 125

// 25 + 5 + 1


// 120 

// 24