package SevenKyu;

import java.util.Objects;

public class Vowels {


  public static void main(String[] args) {
    System.out.println(getCount(null));
  }

  public static int getCount(String str) {

    Objects.requireNonNull(str);
    char vowels[] = {'a', 'o', 'e', 'u', 'i'};

    char inputStr[] = str.toCharArray();

    int vowelsCount = 0;

    for (char anInputStr : inputStr) {
      if (contains(vowels, anInputStr)) {
        vowelsCount++;
      }
    }

    return vowelsCount;
  }

  private static boolean contains(char[] chars, char ch) {
    for (char aChar : chars) {
      if (ch == aChar) {
        return true;
      }
    }
    return false;
  }

}
