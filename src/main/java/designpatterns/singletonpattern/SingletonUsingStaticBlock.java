package designpatterns.singletonpattern;

public class SingletonUsingStaticBlock {

    private static SingletonUsingStaticBlock instance = null;

    private SingletonUsingStaticBlock() {
    }


    static {
        try {
            instance = new SingletonUsingStaticBlock();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("exception occurred while creating singleton instance");
        }
    }

    public static SingletonUsingStaticBlock getInstance(){
        return instance;
    }
}