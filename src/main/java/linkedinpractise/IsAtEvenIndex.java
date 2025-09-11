package linkedinpractise;

public class IsAtEvenIndex {
    public static void main(String[] args) {
        System.out.println(isAtEvenIndex("HeLLo", 'L'));
        System.out.println(isAtEvenIndex("HeLLo", 'H'));
        System.out.println(isAtEvenIndex("HeLLo", 'T'));
        System.out.println(isAtEvenIndex("HeLLo", 'o'));
        System.out.println(isAtEvenIndex(null, 'H'));
        System.out.println(isAtEvenIndex("", 'H'));
    }
    public static boolean isAtEvenIndex(String s, char item) {
        if (s == null|| s.isEmpty()) return false;
        for(int i = 0 ; i < s.length(); i=i+2) {
            if(s.charAt(i) == item)
                return true;
        }
        return false;
    }
}
