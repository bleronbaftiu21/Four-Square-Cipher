public class FourSquareCipher {
    private Square plainSquare;
    private Square cipherSquare1;
    private Square cipherSquare2;

    public FourSquareCipher(String key1, String key2) {
        plainSquare = new Square(""); // Standard alphabet square
        cipherSquare1 = new Square(key1); // Top-right square
        cipherSquare2 = new Square(key2); // Bottom-left square
    }

    public String encrypt(String plaintext) {
        String prepared = TextPreprocessor.prepareText(plaintext);
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < prepared.length(); i += 2) {
            char a = prepared.charAt(i);
            char b = prepared.charAt(i + 1);

            int[] posA = plainSquare.findPosition(a);
            int[] posB = plainSquare.findPosition(b);

            char encA = cipherSquare1.getChar(posA[0], posB[1]);
            char encB = cipherSquare2.getChar(posB[0], posA[1]);

            ciphertext.append(encA).append(encB);
        }

        return ciphertext.toString();
    }
}
