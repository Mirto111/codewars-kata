package SixKyu;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> digpows = new ArrayList<>();
        for (long i = a; i < b; i++) {
            String ch = String.valueOf(i);
            int pow = 1;
            long sum = 0;

            for (int j = 0; j < ch.length(); j++) {
                sum = sum +  (long)Math.pow(ch.charAt(j) - '0', pow++);

                if (sum > i)
                    break;
            }
            if (sum == i)
                digpows.add(sum);
        }
        return digpows;
    }
}