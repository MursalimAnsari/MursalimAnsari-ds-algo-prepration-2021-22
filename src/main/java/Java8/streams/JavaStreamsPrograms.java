package Java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsPrograms {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101,"Anu",340000,"HR","active"));
        empList.add(new Employee(102,"Mursalim",200000,"Technical","active"));
        empList.add(new Employee(103,"Sameer",300000,"HR","inactive"));
        empList.add(new Employee(104,"Insha",100000,"Technical","active"));
        empList.add(new Employee(105,"Sam",150000,"Technical","inactive"));
        empList.add(new Employee(106,"Jack",30000,"Sales","active"));
        empList.add(new Employee(107,"Azzi",40000,"Sales","active"));



        // find out all employee details based on departmentName
        Map<String, List<Employee>> empDetailsBasedOnDep =
                empList.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.toList()));

        // print employee details
        empDetailsBasedOnDep.entrySet().forEach(entry->{
            System.out.println(entry.getKey() +"-----"+ entry.getValue());
        });

        // WAP t print the number of employees working in each department ?
        Map<String ,Long> empCountBasedOnDep=
                             empList.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.counting()));
       // printing count of employees
        empCountBasedOnDep.entrySet().forEach(
                    entry-> {
                    System.out.println(entry.getKey() + "------" +entry.getValue());
                } );

        // print no of the active/inactive employees...
        long activeEmpCount=  empList.stream().filter(e->"active".equals(e.getStatus())).count();
        System.out.println("active employees: " + activeEmpCount);
        // same for inactive employees

        // find the max/min salary int employee class
        // returns an optional
       Optional<Employee> emp1= empList.stream().max(Comparator.comparing(Employee::getSalary));
       Optional<Employee> emp2= empList.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println(emp1);
        System.out.println(emp2);


      // find the employee with top 3rd salary..

     Optional<Integer> empThirdSalary = empList.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println("Third highest salaried employee: "+empThirdSalary);


    // find top 3 employees with high salary





    }

}
