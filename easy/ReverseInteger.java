package easy;


// https://leetcode.com/problems/reverse-integer/

class ReverseInteger {
    public static void main(String[] args) {
        Common.FastReader fr=new Common.FastReader();
        while(true)  {
            int result = reverse(fr.nextInt());

            //Print result
            System.out.println(result);
        }

    }

    public static int reverse(int x){
		long r = 0;
		while(x != 0){
			r = r*10 + x%10;
			x /= 10;
		}
		if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
			return (int)r;
		else
			return 0;
	}
}