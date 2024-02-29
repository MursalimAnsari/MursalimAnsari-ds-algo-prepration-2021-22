package designpatterns.singletonpattern;

public class BillPughMethodSingletonClass {


    private BillPughMethodSingletonClass() {
        System.out.println("constructor invoked by static method");
    }

    private static  class SingletonHelper{
        private static final  BillPughMethodSingletonClass instance= new BillPughMethodSingletonClass();
    }

    public static BillPughMethodSingletonClass getInstance(){
        return SingletonHelper.instance;
    }

}
