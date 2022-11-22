package interviewquestions;
import java.util.Scanner;

public class FindAllPrimeNumbers {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of prime numbers ");
        int num = sc.nextInt();

        findPrimeNumbers(num);

    }

    private static void findPrimeNumbers(int num){

        if(num<1){
            System.out.println("can't find prime numbers");
        }

        for(int i=1; i<=num; i++){

            isPrime(i);

        }

    }

    private static void isPrime(int i) {

        int count=0;

        if(i>1){

            for(int counter=1;counter<=i;counter++){
                if(i%counter==0)
                  count++;
            }

            if(count==2){
                System.out.print(i+" ");
            }
         }
    }

}
