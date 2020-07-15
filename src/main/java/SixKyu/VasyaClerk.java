package SixKyu;

      /*The new "Avengers" movie has just been released!
    There are a lot of people at the cinema box office standing in a huge line.
    Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
    Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
    Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?
    Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.*/

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VasyaClerk {

  public static String Tickets(int[] peopleInLine) {
    TreeMap<Integer, Integer> moneys = new TreeMap<>(Comparator.reverseOrder());
    moneys.put(25, 0);
    moneys.put(50, 0);
    moneys.put(100, 0);

    for (int bill : peopleInLine) {
      int change = bill - 25;
      if (change != 0) {
        for (Entry<Integer, Integer> entry : moneys.entrySet()) {
          while (entry.getValue() != 0 && change - entry.getKey() >= 0) {
            change = change - entry.getKey();
            moneys.computeIfPresent(entry.getKey(), (key, value) -> value - 1);
          }
        }
        if (change > 0) {
          return "NO";
        }
      }
      moneys.computeIfPresent(bill, (key, value) -> value + 1);
    }
    return "YES";
  }
}