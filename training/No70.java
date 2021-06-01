import java.util.HashMap;
import java.util.Map;

class No70 {

    private static final int CLIMBSTEP1 = 1;
    private static final int CLIMBSTEP2 = 2;

    private static HashMap<Integer, Integer> note = new HashMap<Integer, Integer>();

    public static int climbStairs(int n) {
        return climbStairsRes(n, 0);
    }

    public static int climbStairsRes(int remainStep, int climStep) {

        remainStep = remainStep - climStep;
        if(note.containsKey(remainStep))
            return note.get(remainStep);
        if(remainStep == 1)
            return 1;
        if(remainStep == 2)
            return 2;
        int result = climbStairsRes(remainStep, CLIMBSTEP1) + climbStairsRes(remainStep, CLIMBSTEP2);
        note.put(remainStep, result);

        return result;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}