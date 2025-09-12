package linkedinpractise.array;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

//time O(n)
public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,8,0};
        System.out.println(linearSearch(a, 7));
        System.out.println(linearSearch(a, 9));

        linearSearch2(a, 7).ifPresent(System.out::println);
        linearSearch2(a, 9).ifPresent(System.out::println);

    }
    public static boolean linearSearch(int[] arrays, int item) {
        for (int current : arrays) {
            if (current == item) return true;
        }
        return false;
    }
    public static OptionalInt linearSearch2(int[] arrays, int item) {
        return Arrays.stream(arrays).filter(x -> x == item).findFirst();
    }

}
