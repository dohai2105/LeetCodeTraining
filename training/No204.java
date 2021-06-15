//https://www.geeksforgeeks.org/sieve-of-eratosthenes/

public class No204 {
    public static int countPrimes(int n) {
        if(n <= 2) return 0;
        int count = n/2;
        boolean []isPrimesMatrix = new boolean[n];

        for (int i = 3; i*i < n; i += 2) {
            if(isPrimesMatrix[i] == true)
                continue;
            for(int j = i*i; j < n; j += 2*i){
                if(isPrimesMatrix[j] ==  false) {
                    isPrimesMatrix[j] = true;
                    count --;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countPrimes(12);
    }
}



// Count the number of prime numbers less than a non-negative number, n.

 

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.