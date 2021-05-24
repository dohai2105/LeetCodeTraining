

import java.util.HashMap;

public class RomanToInterger {
    static HashMap<Character, Integer> romanToInHm = new HashMap<>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public static int romanToInt(String s) {
        
        int length = s.length();
        int rs = 0;
        boolean isSubstract = false;
        for (int i=0; i<length; i++) {
            char currentChar = s.charAt(i);
            if(!isSubstract 
            && (currentChar == 'I' || currentChar == 'X' || currentChar == 'C') 
            && i < length - 1 
            && romanToInHm.get(currentChar) < romanToInHm.get(s.charAt(i + 1))) {
                rs -= romanToInHm.get(s.charAt(i));
                isSubstract = true;
            } else {
                rs += romanToInHm.get(s.charAt(i));
                isSubstract = false;
            }
         }

        return rs;
    }

    public static void main (String[] args){
        int rs = romanToInt("DCXXI");
        System.out.println(rs);
    }
    
}

