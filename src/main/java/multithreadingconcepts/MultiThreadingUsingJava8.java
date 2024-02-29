package multithreadingconcepts;

public class MultiThreadingUsingJava8 {


    public static void main(String[] args) {

        // Runnable interface using java 8 lambda expression...
        Runnable r = ()-> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);

                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
         };

    Thread t1= new Thread(r,"mursu");
    Thread t2= new Thread(r, "anu");
    t1.start();
    t2.start();

    }

}


