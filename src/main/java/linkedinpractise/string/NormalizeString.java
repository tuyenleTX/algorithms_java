package linkedinpractise.string;

import java.util.Locale;

public class NormalizeString {
    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }
    public static void main(String[] args) {
        System.out.println(normalizeString("      HELLO there, BUddy!      "));
    }
}
