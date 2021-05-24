

// https://leetcode.com/problems/divide-two-integers/

// 10 / 3

// 3 1
// 6 2
// 12 4

// rs = 2


// 4 /3

// 3 1
// 6 2

// rs = 1
public class No29 {
	public static int divide(int dividend, int divisor) {
		boolean isNegetive = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? true : false;
		long absDividend = Math.abs((long)dividend);
		long absDivisor = Math.abs((long)divisor);

		if(dividend == 0) return 0;

		long rs = 0;
		while(absDividend >= absDivisor) {
			long count = 1;
			//long tmpDividend = absDivisor;
			long tmpDivisor = absDivisor;
			while(absDividend >= tmpDivisor) {
				tmpDivisor = tmpDivisor << 1;
				count = count << 1;
			}
			rs += count >> 1;
			absDividend -= tmpDivisor >> 1;
		}

		return isNegetive ? (int)~rs + 1 : rs > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)rs;
	}
	
	public static void main (String[] args){
		int rs = divide(10, 3);
		System.out.println(rs);
	}
}
