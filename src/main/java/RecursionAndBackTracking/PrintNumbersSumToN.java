package RecursionAndBackTracking;

public class PrintNumbersSumToN {


    public static void main(String[] args) {

        double n=1000 ;

        System.out.println(findSum((int) n));

    }

    private static double  findSum(int n) {

        if(n==1) return 1;

        return n+findSum(n-1);


    }


}
