public class No344 {
//     Input: s = ["h","e","l","l","l","o"]
// Output: ["o","l","l","e","h"]
    public void reverseString(char[] s) {
        int length = s.length;
        int doubleJumpIdx = 0;
        int index = 0;
        while (doubleJumpIdx < length - 1) {
            doubleJumpIdx = doubleJumpIdx+2;
            char tmp = s[index];
            s[index] = s[length - index - 1];
            s[length - index - 1] = tmp;
            index ++;
        }
    }
}
