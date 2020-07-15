package SixKyu;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        Map<String, Integer> countMap = new HashMap<>();
        char[] ch = text.toCharArray();

        for (char c : ch) {

            String s = String.valueOf(c).toLowerCase();

            if (countMap.containsKey(s)) {
                countMap.computeIfPresent(s, (key, val) -> val + 1);
            } else {
                countMap.put(s, 1);
            }
        }

        long countDupl = countMap.entrySet().stream().filter(map -> map.getValue() > 1).collect(Collectors.counting());
        return (int) countDupl;
    }

    public static void main(String[] args) {
        CountingDuplicates.duplicateCount("aabBcde");
        CountingDuplicates.duplicateCount("aA11");

    }
}