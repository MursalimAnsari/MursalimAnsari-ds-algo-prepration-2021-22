package RecursionAndBackTracking;

import java.util.Scanner;

public class PowerFunction {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of X :");
        int x = sc.nextInt();

        System.out.println("Enter value of N :");
        int n = sc.nextInt();



       int ans = powerOf(x , n);
        System.out.println("Power of " + x +" is "  +ans);
    }

    private static int  powerOf(int x, int n) {

        //base case...
        if(n==0) return 1;

        // x^n-1 = powerOf(x, n-1)   ::  2^3 = powerOf(2,3)
        int xnm1 = powerOf(x, n-1);

        // xn = x * x^n-1
         int xn = x*xnm1;

        return xn;
    }
}
