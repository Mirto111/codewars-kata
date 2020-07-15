package SevenKyu;

import java.util.Arrays;

public class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length==0 || a2.length==0) return -1;

        int minA1 = minStringLength(a1);
        int minA2 = minStringLength(a2);
        int maxA1 = maxStringLength(a1);
        int maxA2 = maxStringLength(a2);
    
        return Integer.max(maxA1-minA2, maxA2-minA1);
    }

    private static int minStringLength(String[] strings){
        return Arrays.stream(strings).mapToInt(v -> v.length()).min().getAsInt();
    }
    private static int maxStringLength(String[] strings){
        return Arrays.stream(strings).mapToInt(v -> v.length()).max().getAsInt();
    }
}