import java.util.ArrayList;
import java.util.List;

public class No118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>(numRows);
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i) {
                    rowList.add(1);
                } else {
                    List<Integer> beforeRow = result.get(i - 1);
                    int tmpSum = beforeRow.get(j) + beforeRow.get(j - 1);
                    rowList.add(tmpSum);
                }
            }
            result.add(rowList);
        }
        return result;
    }
}



[
    [1],
    [1,1],
    [1,2,1],
    [1,3,3,1],
    [1,4,6,4,1],
    1,5,10,10,5,1
]