package src.recursivity.exercises;

public class FibbonaciComCauda {

    public static void main(String[] args) {
        System.out.println(fibbonaci(0));
        System.out.println(fibbonaci(1));
        System.out.println(fibbonaci(45));
        System.out.println(fibbonaci(6));
    }

    public static int fibbonaci(int n) {
        return fibbonaciTailRecursive(n, 0, 1);
    }

    private static int fibbonaciTailRecursive(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibbonaciTailRecursive(n - 1, b, a + b);
    }

}
