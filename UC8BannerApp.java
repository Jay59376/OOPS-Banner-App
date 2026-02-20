import java.util.HashMap;
import java.util.Map;

public class UC8BannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(map.get(c)[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}