package designpatterns.singletonpattern;

public class TestSingletonWithStaticBlock {
    public static void main(String[] args) {

        SingletonUsingStaticBlock s1= SingletonUsingStaticBlock.getInstance();
        SingletonUsingStaticBlock s2= SingletonUsingStaticBlock.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}
