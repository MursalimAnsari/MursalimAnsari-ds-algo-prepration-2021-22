package Java8;


@FunctionalInterface
interface  HelloInterface{

    public void sayHello(String s);

}

// class HelloDemo implements HelloInterface{
//     @Override
//     public void sayHello() {
//         System.out.println("Hello");
//     }
// }


// Without using lambda expression
//public class LambdaExpressionDemo  {
//
//    public static void main(String[] args) {
//
//        HelloInterface i = new HelloDemo();
//        i.sayHello();
//
//    }
//}

  // With Lambda Expression
public class LambdaExpressionDemo{
      public static void main(String[] args) {

          HelloInterface i = (s)-> System.out.println("Hello");


      }
  }