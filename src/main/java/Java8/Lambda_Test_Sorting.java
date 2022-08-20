package Java8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Lambda_Test_Sorting {


    public static void main(String[] args) {

        List<EmployeeDemo> list= new ArrayList<>();

        list.add(new EmployeeDemo(1,"mursalim"));
        list.add(new EmployeeDemo(5,"sameer"));
        list.add(new EmployeeDemo(4,"anas"));
        list.add(new EmployeeDemo(7,"joya"));
        list.add(new EmployeeDemo(9,"zeeshan"));


        System.out.println("Before Sorting ");
        //System.out.println(list);
        list.forEach(EmployeeDemo-> System.out.println(EmployeeDemo));


//Sorting custom employees using comparator class

        Collections.sort(list, new Comparator<EmployeeDemo>() {
                    @Override
                    public int compare(EmployeeDemo o1, EmployeeDemo o2) {
                        return o1.getId()-o2.getId(); } } );

        System.out.println("*******************************************************************");

         System.out.println("After sorting based on id ");
         //System.out.println(list);
         list.forEach(EmployeeDemo-> System.out.println(EmployeeDemo));

        System.out.println("###########################################################################");


        Collections.sort(list, new Comparator<EmployeeDemo>() {
            @Override
            public int compare(EmployeeDemo o1, EmployeeDemo o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        } );

        System.out.println("Sorting based on Employee Name ");

        list.forEach(EmployeeDemo-> System.out.println(EmployeeDemo));

    }

}
