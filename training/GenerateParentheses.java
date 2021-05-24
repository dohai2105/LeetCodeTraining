

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {
    static List<String> result;
    public static List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        String input = "";
        combineRecursive(input,0,0,n);
        return result;
        
        // ["((()))","(()())","(())()","()(())","()()()"]
    }

    public static void combineRecursive(String input, int open, int close, int n){
        if(input.length() == n*2){
            result.add(input);
            return;
        }

        if(open < n)
            combineRecursive(input+"(", open + 1, close, n);
        if(close < open && close < n)
            combineRecursive(input+")", open, close + 1, n);
    }

    public static void main(String args[]){
        generateParenthesis(3);
    }
}
