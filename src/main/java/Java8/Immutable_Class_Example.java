package Java8;

/*

 QUES: HOW TO MAKE A CLASS IMMUTABLE IN JAVA?

 ANS:
      1. The class must be declared as final so that child classes can’t be created.
      2. Data members in the class must be declared private and final so that direct access is not allowed.
      3. A  parameterized constructor should initialize all the fields performing a deep copy so
         that data members can’t be modified with an object reference.
      4.
 */


import java.util.Objects;

public class Immutable_Class_Example {

     public static void main(String[] args) {


         User user = new User(1,"Mursalim");

         System.out.println(user.getId());
         System.out.println(user.getName());
         System.out.println(user.getClass());

     }

   }


   final class User{

    private final int id;
    private final String name;

    public User( int id, String name){
        this.id=id;
        this.name= name;
    }

    public  int getId(){
        return id;
    }
       public  String getName(){
           return name;
       }

       @Override
       public boolean equals(Object obj) {

         User user = (User)obj;
         if (this.name.equals(user.name)){
             return true;
         }
       return false;
    }

       @Override
       public int hashCode() {
           return Objects.hash(id, name);
       }

       @Override
       public String toString() {
           return "User{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   '}';
       }
   }