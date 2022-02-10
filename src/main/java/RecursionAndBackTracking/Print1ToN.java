package RecursionAndBackTracking;

public class Print1ToN {

    public static void main(String[] args) {
        int n = 4;

        printTO_N(1, 4);
        System.out.println(" ");
        System.out.println("reverse ");

        print_N_To_One(4,4);
    }

    private static void print_N_To_One(int i, int n) {

        //base case
        if (i<1)
            return;


        System.out.println(i);

        print_N_To_One(i-1,n);

    }

    private static void printTO_N(int i, int n) {

         //base case
         if(i>n){
             return;
         }
        System.out.println(i);
         printTO_N(i+1,n);

    }





}
