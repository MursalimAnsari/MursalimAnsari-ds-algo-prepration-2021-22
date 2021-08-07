package RecursionAndBackTracking;

public class FibonacciNumber {

    public static void main(String[] args) {

        int n=7;

        System.out.println(fib(n));

    }

    private static int fib(int n) {

    // 0 1 1 2 3 5 8 13 ...

        if(n==0)return 0;

         if(n<=2)return 1;

         return fib(n-2)+fib(n-1);


    }

}
