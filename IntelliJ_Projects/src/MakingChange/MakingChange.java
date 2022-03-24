package MakingChange;
public class MakingChange {
    public static int minimumCoins(int money, int[] coins) {
        if (money == 0) return 0;

        int table[] = new int[money + 1];

        table[0] = 0;

        for (int i=1; i <= money; i++)
            table[i] = Integer.MAX_VALUE;

        for (int i=1; i<= money; i++){
            for (int j=0; j<coins.length; j++){
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
            }
        }
        if (table[money] == Integer.MAX_VALUE) return -1;

        return table[money];
    }
}
