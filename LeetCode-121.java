public class Test {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        int minPrice = prices[0];
        int profit = 0;
        if (prices.length < 1) {

        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                if (prices[i] - minPrice > profit)
                    profit = prices[i] - minPrice;
            }
        }
        System.out.println(profit);
    }

}
