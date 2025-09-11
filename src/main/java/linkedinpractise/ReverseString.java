package linkedinpractise;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse(""));
       // System.out.println(reverse(null));
        System.out.println(reverse("Hello"));
        System.out.println(reverse("Hi!"));
    }
    public static String reverse(String s) {
        if (s.isEmpty() || s == null) return s;
        StringBuilder reversed = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i --) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
