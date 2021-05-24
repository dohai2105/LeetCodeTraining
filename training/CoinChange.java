

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/regular-expression-matching
class CoinChange {
    public static int coinChange(int[] coins, int amount, Map<Integer, Integer> amountStore) {

        if(amount == 0) return 0;
        if(amount < 0) return -1;
        if(amountStore.containsKey(amount)) return amountStore.get(amount);
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = coinChange(coins, amount - coin, amountStore);
            if (result >= 0 && result < min){
                min = result;
            } 
        }
        min = min == Integer.MAX_VALUE ? -1 : min + 1;
        amountStore.put(amount, min);

        return amountStore.get(amount);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> amountStore = new HashMap<Integer, Integer>();
        int result = coinChange(new int[]{2,5,10,1}, 27, amountStore);

        System.out.println(result);
    }
}