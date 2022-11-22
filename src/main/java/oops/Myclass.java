package oops;

abstract class Myclass {

   int x=10;

   public abstract void greet();

   public String  sayHello(){
      return "Hello from Child";
   }

   {
      System.out.println("Instance block ");
   }


}
