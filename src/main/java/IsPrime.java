public class IsPrime {
    public static void main(String[] args) {
        int n = 9;
        boolean test = isPrime(n);
        System.out.println(test);

        int x = 5;
//        int y = x++;
//        int z = ++x;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
        System.out.println(x++ + ++x);
    }
    public static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i <= n - 1; i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}
