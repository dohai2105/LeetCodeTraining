

public class RegularExpressionMatching {
    // public static boolean isMatch(String s, String p) {
    //     if(p.length() == 0) return s.length() == 0;

    //     boolean isFirstMatch = (!s.isEmpty()) && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)); 

    //     if(p.length() >= 2 && p.charAt(1) == '*') {
    //         return isMatch(s, p.substring(2)) || (isFirstMatch && isMatch(s.substring(1), p));
    //     }else {
    //         return isFirstMatch && isMatch(s.substring(1), p.substring(1));
    //     }
    // }
    static Result [][] memo;

    enum Result {
        True,
        False
    }

    public static boolean isMatch(String s, String p) {
        memo = new Result[s.length() + 1][p.length() + 1];
        return dp(0, 0, s, p);
    }

    public static boolean dp(int i, int j, String s, String p) {
        if(memo[i][j] != null) return memo[i][j] == Result.True;

        boolean result = false;

        if (j == p.length()){
            result = i == s.length();
        } else{
            boolean first_match = (i < s.length() &&
                                   (p.charAt(j) == s.charAt(i) ||
                                    p.charAt(j) == '.'));

            if (j + 1 < p.length() && p.charAt(j+1) == '*'){
                result = (dp(i, j+2, s, p) ||
                       first_match && dp(i+1, j, s, p));
            } else {
                result = first_match && dp(i+1, j+1, s, p);
            }
        }
        
        memo[i][j] = result ? Result.True : Result.False;
        return result;
    }

    public static void main(String[]args){
        boolean rs = isMatch("aab", "c*a*b");
        
        System.out.print(rs);
    }
}
