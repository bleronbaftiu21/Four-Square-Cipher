
public class TextPreprocessor {
    public static String prepareText(String input) {
        StringBuilder sb = new StringBuilder();
        input = input.toUpperCase().replaceAll("[^A-Z]", "").replace("Q", "");
        int i = 0;
        while (i < input.length()) {
            char first = input.charAt(i);
            char second = (i + 1) < input.length() ? input.charAt(i + 1) : 'X';
            if (first == second) {
                sb.append(first).append('X');
                i++;
            } else {
                sb.append(first).append(second);
                i += 2;
            }
        }
        if (sb.length() % 2 != 0) {
            sb.append('X');
        }
        return sb.toString();
    }
}