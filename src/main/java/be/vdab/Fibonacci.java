package be.vdab;

public class Fibonacci {
    public static void main(String[] args) {
        fib(6);

    }

    /**
     * Calculates fibonacci sequence.
     * @param n How many numbers
     * @return the last number of the sequence.
     */
    public static int fib(int n) {
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);
        int som = 0;
        for(int i = 1; i < n; i++) {
            som = a + b;
            System.out.println(som);
            a = b;
            b = som;
        }
        return som;
    }
}
