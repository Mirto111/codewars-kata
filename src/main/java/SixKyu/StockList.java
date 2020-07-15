package SixKyu;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StockList {

  // 1st parameter is the stocklist (L in example),
  // 2nd parameter is list of categories (M in example)
  public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

    if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
    
    Map<String, Integer> stocklist = Arrays.stream(lstOf1stLetter)
        .collect(Collectors.toMap(Function.identity(), v -> 0));

    for (int i = 0; i < lstOfArt.length; i++) {

      String[] sp = lstOfArt[i].split(" ");
      stocklist.computeIfPresent(String.valueOf(sp[0].charAt(0)), (key, val) -> val + Integer.parseInt(sp[1]));
    }

    return stocklist.entrySet().stream().map(e -> "(" + e.getKey() + " : " + e.getValue() + ")")
        .collect(Collectors.joining(" - "));
  }
}