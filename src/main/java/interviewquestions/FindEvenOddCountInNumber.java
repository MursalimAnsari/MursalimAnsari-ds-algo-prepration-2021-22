package interviewquestions;

public class FindEvenOddCountInNumber {

    public static void main(String[] args) {

        int num= 13456765;
        int evenCount=0;
        int oddCount =0;

        while(num>0){

            int x = num%10;
            if(x%2==0){
                evenCount++;
            }else{
                oddCount++;
            }

            num = num/10;

        }

        System.out.println("Even Count: " +evenCount + "  "+"Odd Count: "+oddCount);

    }


}




