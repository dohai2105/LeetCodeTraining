

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static boolean isValid(String s) {
        int length = s.length();
        List<Character> leftParentTmp = new ArrayList<Character>();
        char[] listParen = s.toCharArray();

        for(int i=0;i<length;i++){
            char letter = listParen[i];
            int tmpListLength = leftParentTmp.size();
            if(tmpListLength > 0 && isPair(leftParentTmp.get(tmpListLength-1), letter) ){
                leftParentTmp.remove(tmpListLength-1);
            } else {
                leftParentTmp.add(letter);
            }
        }
        if(leftParentTmp.size() == 0){
            return true;
        }
        return false;
    }

    public static boolean isPair(char a, char b) {
        if(a=='[' && b==']' || a=='{'&&b=='}' || a=='('&&b==')'){
            return true;
        }
        return false;
    }

    public static void main(String []args){
        isValid("()[]{}");
    }
}

