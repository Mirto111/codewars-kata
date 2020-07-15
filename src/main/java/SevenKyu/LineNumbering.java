package SevenKyu;

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {

        List<String> numLines = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            numLines.add(i + 1 + ":" + " " + lines.get(i));
        }

        return numLines;
    }
}