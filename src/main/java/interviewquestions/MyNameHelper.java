package interviewquestions;

public class MyNameHelper implements MyName{

    @Override
    public void printName(String name){

     System.out.println("My name is " +name);

    }

    public static void main(String[] args) {
        MyNameHelper mh= new MyNameHelper();
        mh.printName("Sameer");
    }

}

