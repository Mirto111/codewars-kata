package SevenKyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {


  public static String toJadenCase(String phrase) {

    if (phrase == null || phrase.isEmpty()){
      return null;
    }

    Pattern p = Pattern.compile("(?:^| )[a-z]");
    Matcher matcher = p.matcher(phrase);

    StringBuffer result = new StringBuffer();

    while (matcher.find()) {
      System.out.println(matcher.group());
      matcher.appendReplacement(result, matcher.group().toUpperCase());
    }
    matcher.appendTail(result);
    return result.toString();
  }

  public static void main(String[] args) {

    String input = "How can 222mirrors, be real if our eyes aren't real";

    System.out.println(toJadenCase(input));



  }

}
