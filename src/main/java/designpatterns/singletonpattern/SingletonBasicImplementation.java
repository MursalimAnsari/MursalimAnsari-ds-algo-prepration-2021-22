package designpatterns.singletonpattern;

/*
*   How to create a singleton class in java
*    create all the variables in a class as private, static and final
*    make the constructor private
*    public getter method and don't create setter methods
*/


public class SingletonBasicImplementation {

     private static SingletonBasicImplementation singletonInstance=null;
    private SingletonBasicImplementation(){
        System.out.println("object initialised");
    }

    // making thread safe
    public static SingletonBasicImplementation getInstance(){
        if(singletonInstance==null){
            // using only synchronized keyword is not sufficient and it won't help
            // use double check locking mechanism to stop multiple objects creation
            synchronized (SingletonUsingStaticBlock.class){
                // double lock
                if(singletonInstance==null)
               singletonInstance = new SingletonBasicImplementation();
           }
       }
      return singletonInstance;
    }

}
