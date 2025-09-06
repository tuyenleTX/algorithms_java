public class RevertAString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = revertAString(a);
        System.out.println(b);
    }
    public static String revertAString(String a) {
        String result = "";
        for(int i = 0; i < a.length(); i ++) {
            char temp = a.charAt(a.length() - 1 - i);
            result += temp;
        }
        return result;
    }
}
