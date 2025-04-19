import java.util.LinkedHashSet;
import java.util.Set;

public class Square {
    private char[][] grid = new char[5][5];

    public Square(String key) {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
        Set<Character> used = new LinkedHashSet<>();
        key = key.toUpperCase().replaceAll("[^A-Z]", "").replace("Q", "");
        for (char c : key.toCharArray()) {
            used.add(c);
        }
        for (char c : alphabet.toCharArray()) {
            used.add(c);
        }
        int i = 0;
        for (char c : used) {
            grid[i / 5][i % 5] = c;
            i++;
        }
    }

    public int[] findPosition(char c) {
        c = Character.toUpperCase(c);
        if (c == 'Q') c = 'K';
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (grid[row][col] == c) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }


}

