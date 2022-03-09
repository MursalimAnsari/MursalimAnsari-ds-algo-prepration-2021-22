package MathProblems;

public class DecimalToBinary {

    public static void main(String[] args) {

        toBinary(20);
    }

    private static void toBinary(int num) {

       int n =  num;
       StringBuilder sb = new StringBuilder();

       while (num>0){
           sb.append(num%8);
           num /=8;
       }
        System.out.println("number: "+ n + ", octal representation: " +sb.reverse().toString());

    }

}
