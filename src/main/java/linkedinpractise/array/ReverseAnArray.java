package linkedinpractise.array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int [] reverse = reverseAnArray(arr);
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(reverse[i]);
        }
    }
    public static int[] reverseAnArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i ++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }
}
