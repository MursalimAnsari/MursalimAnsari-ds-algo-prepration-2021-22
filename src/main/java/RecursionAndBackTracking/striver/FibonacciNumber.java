package RecursionAndBackTracking.striver;

public class FibonacciNumber {

    public static void main(String[] args) {

        int n=9;

       System.out.println(fib(n));

       // System.out.println(fibonacci(n));
        System.out.println();
        fibonacciSeries(n);

    }

    private static double fibonacci(int n) {

       if(n==0) return 0;
       if(n==1 || n==2) return 1;

       return fibonacci(n-2) + fibonacci(n-1);
    }

    private static int fib(int n) {

    // 0 1 1 2 3 5 8 13 ...

        if(n==0)return 0;

         if(n<=2)return 1;

         return fib(n-2)+fib(n-1);

    }



    private  static  void fibonacciSeries(int n){

        int n1 =0;
        int n2= 1;
        System.out.print(n1+ " " +n2 );

        for (int i=2; i<=n; i++){
            int n3 = n1 + n2;
            System.out.print(" " +n3);
            n1= n2;
            n2= n3;
        }

    }


}
