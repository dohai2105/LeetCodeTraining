

//https://leetcode.com/problems/implement-strstr/
public class No28 {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        char[] haystackCharArr = haystack.toCharArray();
        char[] needleCharArr = needle.toCharArray();

        int hitFirstPosition = -1;
        boolean isExist = false;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystackCharArr[i] == needleCharArr[0] && i+needleCharArr.length <= haystack.length()) {
                isExist = true;
                for(int j = 1;j < needleCharArr.length; j++) {
                    if(haystackCharArr[i+j] != needleCharArr[j]) {
                        isExist = false;
                        break;
                    }
                }
                if(isExist){
                    hitFirstPosition = i;
                    break;
                }
            }
        }
        return hitFirstPosition;
    }

    public static void main (String []args){
        strStr("a", "a");
    }
}
