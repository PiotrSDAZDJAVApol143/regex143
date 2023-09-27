import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Zadanie22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oryginalTXT = scanner.nextLine();
        int code = 2;
        String cezarTXT = cezarEncrypt(oryginalTXT, code);
        System.out.println(cezarTXT);
    }

    public static String cezarEncrypt(String oryginalTXT, int code) {
        String cezarTXT = "";

        for (int i = 0; i < oryginalTXT.length(); i++) {

            char currentChar = oryginalTXT.charAt(i);
            Character.isUpperCase(currentChar);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                char cezarChar = (char) ('A' + (currentChar - 'A' + code) % 26);
                cezarTXT += cezarChar;
            } else {
                cezarTXT += currentChar;
            }
        }
        return cezarTXT;
    }

}

