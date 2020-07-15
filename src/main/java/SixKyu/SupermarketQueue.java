package SixKyu;

import java.util.Arrays;

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] quantityQue = new int[n];

        for (int i = 0; i < customers.length; i++) {
            int ind = getMinQueue(quantityQue);
            quantityQue[ind] = quantityQue[ind] + customers[i];
        }

        int maxQ = Arrays.stream(quantityQue).max().getAsInt();

        return maxQ;
    }

    private static int getMinQueue(int[] qq) {
        int ind = 0;
        int min = qq[0];

        for (int i = 0; i < qq.length; i++) {
            if (qq[i] < min) {
                ind = i;
                min = qq[i];
            }
        }
        return ind;
    }

}