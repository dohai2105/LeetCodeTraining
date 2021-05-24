

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// Note List char is faster than
class LetterCombinPhoneNumber {
    static String [] listChars = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> lastResult;

    public static List<String> letterCombinations(String digits) {
        lastResult = new ArrayList<>();
        if(digits.length() == 0 || digits == "0" || digits == "1") return lastResult;
        combine(digits.toCharArray(), "");
        return lastResult;
    }

    public static void combine(char[] digits , String tmpResult) {
        if(tmpResult.length() == digits.length){
            lastResult.add(tmpResult.toString());
            return;
        }

        int i = tmpResult.length();
        char[] charsToCombine = listChars[digits[i] - '2'].toCharArray();
        for (char letter : charsToCombine) {
            combine(digits, tmpResult + Character.toString(letter));
        }
    }


    public static void main(String []args){
        System.out.println(letterCombinations("23"));
    }
}

