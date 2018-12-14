public class Test {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        int profit = 0;
        if (prices.length < 1) {

        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        System.out.println(profit);
    }

}
