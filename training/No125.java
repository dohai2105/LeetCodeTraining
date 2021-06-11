public class No125 {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty())
            return false;
        char[] inputChars = s.toCharArray();
        int headIdx = 0, tailIdx = inputChars.length - 1;
        char headChar, tailChar;
        while(headIdx < tailIdx) {
            headChar = inputChars[headIdx];
            tailChar = inputChars[tailIdx];
            if(!Character.isAlphabetic(headChar) && !Character.isDigit(headChar)){
                headIdx ++;
            } else if(!Character.isAlphabetic(tailChar) && !Character.isDigit(tailChar)){
                tailIdx --;
            } else if(!(Character.toLowerCase(headChar) == Character.toLowerCase(tailChar))) {
                return false;
            } else {
                headIdx ++;
                tailIdx --;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome("0P");
    }

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
}
