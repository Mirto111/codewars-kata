package SixKyu;

public class StreetFighter {
  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {

    String[] selectFighters = new String[moves.length];
    int x = position[1];
    int y = position[0];
    
    for (int i = 0; i < moves.length; i++) {
      if (moves[i].equals("left")) {
        x = x - 1 < 0 ? fighters[y].length - 1 : x - 1;

      } else if (moves[i].equals("right")) {
        x = x + 1 > fighters[y].length - 1 ? 0 : x + 1;

      } else if (moves[i].equals("up")) {
        y = y - 1 < 0 ? y : y - 1;

      } else if (moves[i].equals("down")) {
        y = y + 1 > fighters.length - 1 ? y : y + 1;

      }
      selectFighters[i] = fighters[y][x];
    }

    return selectFighters;
  }

}