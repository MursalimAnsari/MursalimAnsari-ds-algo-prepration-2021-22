package oops;

public class AbstractClassDemo extends Myclass{

    @Override
    public void greet() {

        System.out.println("Hello from parent");

    }





    public static void main(String[] args) {

         AbstractClassDemo obj1= new AbstractClassDemo();

         obj1.greet();

       // it behaves like a normal method call...
        String ans = obj1.sayHello();
        System.out.println(ans);

       int res = obj1.x;
        System.out.println(res);

     }

}
