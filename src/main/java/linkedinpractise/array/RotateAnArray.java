package linkedinpractise.array;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        Arrays.stream(rotateArray(a)).forEach(System.out::print);
    }
    public static int[] rotateArray(int[] a) {
        int[] result = new int[a.length];
        result[a.length - 1] = a[0];
        for(int i = 0; i < a.length - 1; i ++ ) {
            result[i] = a[i + 1];
        }
        return result;
    }
}
