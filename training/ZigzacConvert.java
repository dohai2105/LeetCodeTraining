


// Visit all characters in row 0 first, then row 1, then row 2, and so on...

// For all whole numbers kk,

// Characters in row 00 are located at indexes k \; (2 \cdot \text{numRows} - 2)k(2⋅numRows−2)
// Characters in row \text{numRows}-1numRows−1 are located at indexes k \; (2 \cdot \text{numRows} - 2) + \text{numRows} - 1k(2⋅numRows−2)+numRows−1
// Characters in inner row ii are located at indexes k \; (2 \cdot \text{numRows}-2)+ik(2⋅numRows−2)+i and (k+1)(2 \cdot \text{numRows}-2)- i(k+1)(2⋅numRows−2)−i.

// https://leetcode.com/problems/zigzag-conversion/

public class ZigzacConvert {

    public static String convert(String s, int numRows) {
        int length = s.length();
        if(numRows == 1){
            return s;
        }
        int jumpNextSteps = numRows*2 - 2;
        StringBuilder rs = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j + i < length ; j += jumpNextSteps){
                rs.append(s.charAt(j + i));

                if (i != 0 && i != numRows - 1 && j + jumpNextSteps - i < length) 
                    rs.append(s.charAt(j + jumpNextSteps - i));
            }
        }

        return rs.toString();

    }

    public static void main(String[] args) {
        String rs = convert("AB",1);
        System.out.println(rs);
        System.out.println("PINALSIGYAHRPI");
    }
}
