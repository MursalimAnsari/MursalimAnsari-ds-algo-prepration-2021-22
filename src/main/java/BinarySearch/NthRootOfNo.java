package BinarySearch;

// we can apply binary search to find the nth root of a number because it will be a monotonic sequence in which
// we will have to find the nth root.




public class NthRootOfNo {

  private static double epsilon = 1e-6;

    public static void main(String[] args) {

        double n=3;
        double m=64;

        double ans = findNthRoot(n,m);

        System.out.println(ans);

    }

    private static double findNthRoot(double n, double m) {

        double low =1, high=m, mid;

         while ((high-low) >epsilon){

             mid = low+(high-low)/2.0;

             if (multiply(mid,n)<m){
                 low =mid;
             } else {
                 high=mid;
             }
         }

         return high;
    }

    private static double multiply(double mid, double n) {

        double mul =1;

        for (int i=1; i<=n ;++i){
               mul = mul*mid;
             }
        return mul;
    }
}
