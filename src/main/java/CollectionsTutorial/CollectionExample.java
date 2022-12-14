package CollectionsTutorial;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class CollectionExample {


    public static void main(String[] args) {

         Employee emp1 = new Employee(101,"mursalin");
         Employee emp2 = new Employee(101,"mursalin");

        HashSet<Employee> set = new HashSet<>();

        set.add(emp1);
        set.add(emp2);

        System.out.println(set);
        System.out.println(set.size());

//         HashMap< Integer , Employee> map1 = new HashMap<>();
//
//         Employee emp1 = new Employee(101,"mursalin");
//         Employee emp2 = new Employee(101,"mursalin");
//
//         map1.put(1,emp1);
//         map1.put(1,emp2);
//
//        System.out.println(map1);

//        Integer i1= 1;
//        Integer i2= 1;
//        HashMap< Integer , String> map2 = new HashMap<>();

//        System.out.println("============================================================");
//
//        map2.put(i1,"mursalim");
//        map2.put(i2,"mursalim");
//
//        System.out.println(map2); // output : {1=mursalim}
//      /*
//          because all wrapper classes override the equals and hashcode methods internally
//          hence whether we are adding the same key again it will not allow us to add the duplicate
//          keys into the hashmap...
//       -> Same in the case of String class it overrides the equals and hashCode() methods internally
//          so we can't add different key into the hashmap
//
//       */
//
    }
}



 class Employee{

   private  int id;
   private  String name;


  // public  Employee(){ }

   public  Employee(int id, String name){
      this.id =id;
      this.name=name;
   }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Employee employee = (Employee) o;
         return id == employee.id && Objects.equals(name, employee.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(id, name);
     }
 }

