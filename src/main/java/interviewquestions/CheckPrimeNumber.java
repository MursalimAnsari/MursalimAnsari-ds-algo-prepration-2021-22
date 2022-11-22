package interviewquestions;

public class CheckPrimeNumber {


    public static void main(String[] args) {


        int num = 21;

        isPrime(num);
    }

    private static void isPrime(int num) {

        int count = 0;

        if (num > 1) {

            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0)
                    count++;
            }
                if (count == 2) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is not a prime number");
                }
        }
    }

}

