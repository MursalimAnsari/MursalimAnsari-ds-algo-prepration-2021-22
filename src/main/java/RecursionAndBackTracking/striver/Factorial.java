package RecursionAndBackTracking;

public class Factorial {

    public static void main(String[] args) {
        int n=20;

        System.out.println(fact(n));
    }

    private static double fact(int n) {

       if(n==0||n==1)return 1;

       return  n*fact(n-1);
    }
}
