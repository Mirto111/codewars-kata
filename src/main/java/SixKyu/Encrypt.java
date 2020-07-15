package SixKyu;

/*Description:
    Encrypt this!

    You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

    Your message is a string containing space separated words.
    You need to encrypt each word in the message using the following rules:
    The first letter needs to be converted to its ASCII code.
    The second letter needs to be switched with the last letter
    Keepin' it simple: There are no special characters in input.*/

public class Encrypt {

  public static String encryptThis(String text) {
    // Implement me! :)
    String[] words = text.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
      char[] ttt = words[i].toCharArray();
      if (ttt.length == 0) {
        return text;
      }
      if (ttt.length == 1) {
        result.append((int) ttt[0]);
      } else if (ttt.length == 2) {
        result.append((int) ttt[0]).append(ttt[ttt.length - 1]);
      } else {
        int first = ttt[0];
        char second = ttt[1];
        char last = ttt[ttt.length - 1];
        String mid = words[i].substring(2, words[i].length()-1);
        result.append(first).append(String.valueOf(last)).append(mid)
            .append(String.valueOf(second));
      }
      result = i < words.length - 1 ? result.append(" ") : result;
    }

    return result.toString();
  }

}
