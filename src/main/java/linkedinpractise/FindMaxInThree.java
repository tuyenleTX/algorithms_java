package linkedinpractise;

public class FindMaxInThree {
    public static void main(String[] args) {
        System.out.println(findMaximumNumber(1,2,3));
        System.out.println(findMaximumNumber(8,8,1));
        System.out.println(findMaximumNumber(3,2,3));
        System.out.println(findMaximumNumber(1,1,9 ));
        System.out.println(findMaximumNumber(1,9,3));
    }
    public static int findMaximumNumber(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
