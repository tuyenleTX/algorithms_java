package linkedinpractise.array;

import java.util.Arrays;

//assuming: array is sorted ascending
//time: O(log(n))
public class BinarySearchInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(binarySearch(a, 3));
        System.out.println(binarySearch(a, 7));

        System.out.println(Arrays.binarySearch(a, 4));//return index
    }
    public static boolean binarySearch(int[] a, int item) {
        int min = 0;
        int max = a.length - 1;
        while (min <= max) {
            int mid = (min + max)/2;
            if (a[mid] == item) return true;
            else if (a[mid] < item) min = mid + 1;
            else max = mid - 1;
        }
        return false;
    }
}
