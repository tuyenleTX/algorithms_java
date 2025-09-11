package linkedinpractise;

public class VerifyPassword {
    public static void main(String[] args) {
        System.out.println(verifyPassword("Hell0"));
        System.out.println(verifyPassword("Hello"));
        System.out.println(verifyPassword("hello"));
        System.out.println(verifyPassword("HELLO"));
    }
    public static boolean verifyPassword(String s) {
        return (s.chars().anyMatch(c -> Character.isDigit(c)) &&
                s.chars().anyMatch(c -> Character.isLowerCase(c)) &&
                s.chars().anyMatch(c -> Character.isUpperCase(c)));
    }
}
