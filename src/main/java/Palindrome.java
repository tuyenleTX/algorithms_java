public class Palindrome {
    public static void main(String[] args) {
        String a = "level";
        String b = "test";
        System.out.println(palindrome(a));
    }
    public static boolean palindrome(String a) {
        for (int i = 0; i < a.length()/2; i ++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) return false;
        }
        return true;
    }
}
