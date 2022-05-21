package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,3,3,4,5,5,6);

        list.forEach(System.out ::println);

        MethodReferenceExample mt = new MethodReferenceExample();
        mt.sayHello();

    }

       public void sayHello() {
        System.out.println("Hello mursu");
    }
}

