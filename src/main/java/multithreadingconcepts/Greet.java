package multithreadingconcepts;

public class Greet {
    String name;

    public Greet(String name) {
        this.name = name;
    }

    public void wish(String name ){
        System.out.println("good morning " +name);
    }
}
