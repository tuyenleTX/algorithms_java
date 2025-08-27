public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = countEvenAndOdd(arr);
        System.out.println("Even: " + result[0] + ", odd: " + result[1]);
    }

    public static int[] countEvenAndOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] % 2 == 0)
                even ++;
            else
                odd ++;
        }
        return new int[]{even, odd};
    }
}
