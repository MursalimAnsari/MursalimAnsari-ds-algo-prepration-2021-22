package interviewquestions;

public class FibonacciSeries {


    public static void main(String[] args) {


        fibonacciSeriesGenerate(10);


    }

    private static void fibonacciSeriesGenerate(int n) {

        int n1=0;
        int n2=1;
        int sum=0;

        System.out.print(n1+ " " +n2+" ");

        for(int i=2; i<n; i++){

            sum = n1+n2;
            System.out.print(sum+" ");

            n1=n2;
            n2=sum;

        }
    }

}
