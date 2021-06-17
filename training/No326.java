public class No326 {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        return reverse(n);
    }

    public static boolean reverse(int n){
        if(n == 3) return true;
        if(n < 3 || n % 3!= 0) return false;
        return reverse(n/3);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(19684));
    }
}
