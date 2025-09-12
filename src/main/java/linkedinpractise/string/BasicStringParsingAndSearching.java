package linkedinpractise.string;

public class BasicStringParsingAndSearching {
    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));

        parsingString(s);
    }
    public static void parsingString(String s) {
        System.out.println("Option 1:");
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
        System.out.println("Option 2:");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
