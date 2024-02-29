package designpatterns.singletonpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonDriver {

    public static void main(String[] args) {

//    SingletonEagerInitialization obj1= SingletonBasicImplementation.getInstance();
//    SingletonEagerInitialization obj2= SingletonBasicImplementation.getInstance();
//
//        System.out.println(obj1);
//        System.out.println(obj2);

        // breaking the singleton class
        // In parallel execution multiple threads get the same resource at a time, they get that
        // object is null and started execution hence we get 3 times the constructor is invoked.
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.execute(()-> SingletonBasicImplementation.getInstance());
//        executorService.execute(()-> SingletonBasicImplementation.getInstance());
//        executorService.execute(()-> SingletonBasicImplementation.getInstance());

        /* still after using these thread safe and so many stuffs this class can be breached, we can break
         the pattern using reflection api and cloning  */

        BillPughMethodSingletonClass obj1 = BillPughMethodSingletonClass.getInstance();
        BillPughMethodSingletonClass obj2 = BillPughMethodSingletonClass.getInstance();

    }
}
