package linkedinpractise;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("sally is a great worker"));
    }
    public static String reverse (String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
    public static String reverseEachWord(String sentence) {
        if(sentence == null || sentence.isEmpty()) return "";
        String[] words = sentence.split(" ");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < words.length; i ++) {
            String temp = reverse(words[i]);
            s.append(temp + " ");
        }
        return s.toString().trim();
    }
}
