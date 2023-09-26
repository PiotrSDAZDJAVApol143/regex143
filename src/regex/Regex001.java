package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {

    /*
    Napisz Regex, który sprawdza polskie numery telefonów komórkowych,
    zaczynające się cyfrą 5.
     */

    private static final Pattern PATTERN = Pattern.compile("^(\\+48)? 5\\d{8}");

    public static void main(String[] args) {
        validate("515332123");
        validate("515336293");
        validate("415336293");
        validate("615332123");
        validate("715332123");
        validate("712123");
        validate("51123");
        validate("+48 518111999");
        validate("48 518111999");
        validate("+8 518111999");
        validate("+4 518111999");
        validate("+ 518111999");


    }

    public static void validate(String text) {
        Matcher matcher = PATTERN.matcher(text);
        if (matcher.matches()) {
            System.out.println("Prawda dla tekstu: " + text);
        } else {
            System.out.println("Fałsz dla tekstu: " + text);
        }
    }
}


