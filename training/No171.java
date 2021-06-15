public class No171 {
    public int titleToNumber(String columnTitle) {
        char []charArr = columnTitle.toCharArray();
        int correspondColNum = 0;
        int CHARATERS_ROUND_SIZE = 26;
        for(int i = 0; i < charArr.length; i++) {
            // correspondColNum = correspondColNum + (CHARATERS_ROUND_SIZE * i) + charArr[i] - 'A' + 1;
            correspondColNum = correspondColNum * CHARATERS_ROUND_SIZE;
            correspondColNum = correspondColNum + charArr[i] - 'A' + 1;
        }
        return correspondColNum;
    }
}

// "B" = 2
// "BC" = (2)26 + 3
// "BCM" = (2(26) + 3)26 + 13