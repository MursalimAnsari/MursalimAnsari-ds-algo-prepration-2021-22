package RecursionAndBackTracking;

public class InfiniteRecursion {

    public static void main(String[] args) {

        f();

    }

    private static void f() {

        System.out.println(1);


        // infinite recursion condition...
        f();

    }



}
