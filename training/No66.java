// https://leetcode.com/problems/plus-one/
public class No66 {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i > 0 ; i--) {
            if (digits[i] < 9) {
                digits[i] = ++digits[i];
                return digits;
            }

            digits[i] = 0;

        }


        int [] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }

    public static void main (String []args) {
        int []test = plusOne(new int[]{9,9});
        for (int i : test) {
            System.out.println(i);
        }
    }
}
