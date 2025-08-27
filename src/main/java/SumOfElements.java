public class SumOfElements {
    public static void main(String[] args) {
        int[] a = {1,-1,6,9};
        System.out.println(sumOfElements(a));
    }
    public static int sumOfElements(int[] a) {
        int total = 0;
        for(int i = 0; i < a.length; i ++ ) {
            total += a[i];
        }
        return total;
    }
}
