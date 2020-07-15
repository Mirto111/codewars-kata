package SevenKyu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 *You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 *
 * Example:
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 *
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 *
 * Note
 * consecutive strings : follow one after another without an interruption
 *
 *
 */

public class LongestConsec {

  public static String longestConsec(String[] strarr, int k) {

    if (strarr.length == 0 || k > strarr.length || k <= 0) {
      return "";
    }

    List<String> concList = new ArrayList<>();
    StringBuilder maxCon = new StringBuilder();

    for (int i = 0; i <= strarr.length - k; i++) {
      for (int j = i; j < i + k; j++) {
        maxCon.append(strarr[j]);
      }
      concList.add(maxCon.toString());
      maxCon = new StringBuilder();
    }

    concList.sort(Comparator.comparing(String::length).reversed());

    return concList.get(0);
  }

  public static void main(String[] args) {
    String[] ee = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
    System.out.println(longestConsec(ee, 1));

  }

}
