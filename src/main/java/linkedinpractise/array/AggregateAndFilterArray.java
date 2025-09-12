package linkedinpractise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class AggregateAndFilterArray {
    public static void main(String[] args) {
        int[] arr1 = {-9, 3, 2, -8, 12, -16};
        int[] arr2 = {0, -3, -8, -35, 40, 20, 7};
        Arrays.stream(mergeEvenNumbers(arr1, arr2)).forEach(System.out::println);

        System.out.println();
        Arrays.stream(mergeEvenNumbers2(arr1, arr2)).forEach(System.out::println);
    }
    public static int[] mergeEvenNumbers (int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : a) {
            if (i%2 == 0) result.add(i);
        }
        for (int i : b) {
            if (i%2 == 0) result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //built in method
    public static int[] mergeEvenNumbers2(int[] a, int[] b) {
        IntPredicate condition = (x -> x%2==0);
        return Stream.of(a, b).flatMapToInt(Arrays::stream).filter(condition).toArray();
    }
}
