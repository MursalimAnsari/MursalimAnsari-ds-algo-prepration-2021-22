package RecursionAndBackTracking;

public class FibonacciNumber {

    public static void main(String[] args) {

        int n=90;

       // System.out.println(fib(n));

        System.out.println(fibonacci(n));

    }

    private static double fibonacci(int n) {

       if(n==0) return 0;
       if(n==1 || n==2) return 1;

       return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int fib(int n) {

    // 0 1 1 2 3 5 8 13 ...

        if(n==0)return 0;

         if(n<=2)return 1;

         return fib(n-2)+fib(n-1);


    }

}
