public class Factorial {
    static int factorial(int x) {
        if (x == 1) return 1;
        return x * factorial(x - 1);

    }

    static int fibonacci(int n) {
        int result;
        if (n == 0 || n == 1) {
            return n;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("factorial is " + factorial(6));
        System.out.println();
        System.out.println("fibonacci is " + fibonacci(15));
    }
}


