package MathProblems;

public class DecimalToBinary {

    public static void main(String[] args) {

        toBinary(5);
    }

    private static void toBinary(int num) {

       int n =  num;
       StringBuilder sb = new StringBuilder();

       while (num>0){
           sb.append(num%2);
           num /=2;
       }
        System.out.println("number: "+ n + ", binary representation: " +sb.reverse().toString());

    }

}
