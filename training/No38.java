public class No38 {

// countAndSay(1) = "1"
// countAndSay(2) = say "1" = one 1 = "11"
// countAndSay(3) = say "11" = two 1's = "21"
// countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
    public static String countAndSay(int n) {
        String s = "1";
        StringBuilder sb;
        int count = 1;
        for (int i = 1 ;i < n; i++) {
            sb = new StringBuilder();
            for (int j = 1;j <= s.length(); j++) {
                if(j == s.length() || s.charAt(j) != s.charAt(j - 1)) {
                    sb.append(count);
                    sb.append(s.charAt(j - 1));
                    count = 1;
                } else count ++;
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        countAndSay(4);
    }
}
