public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 5};
        int[] result = findMaxAndMin(arr);
        System.out.println("min: " + result[0]);
        System.out.println("max: " + result[1]);
    }
    public static int[] findMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i ++) {
            if(arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        return new int[]{min, max};
    }
}
