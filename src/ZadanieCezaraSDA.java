
public class ZadanieCezaraSDA {
    public static void main(String[] args) {
        String text = "MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG";
        int k = 2;

        System.out.println(encrypt(text, k));
    }

    private static String encrypt(String text, int key) {
        String encrypted = ""; //ewentualnie StringBuilder

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

//            if (Character.isLowerCase(currentChar) || Character.isUpperCase(currentChar)) {

            if (Character.isAlphabetic(currentChar)) {
                int charShifted = shiftCharacter(currentChar, key);
                encrypted += (char) charShifted;
            } else {
                encrypted += currentChar;
            }

        }
        return encrypted;
    }

    private static int shiftCharacter(char character, int key) {
        int charShifted = character + key;
        if (charShifted > 90) {
            charShifted -= 26;
        }
        return charShifted;
    }


    private static int shiftCharacter2(char character, int key) {
//        int charShifted = character + key;
//        if (charShifted > 90) {
//            charShifted -= 26;
//        }
//        return charShifted;
        //int characterIndex = character - 'A';
        int characterIndex = character - 65;
        int charShifted = (characterIndex + key) % 26 + 65;
        return charShifted;
    }
}

