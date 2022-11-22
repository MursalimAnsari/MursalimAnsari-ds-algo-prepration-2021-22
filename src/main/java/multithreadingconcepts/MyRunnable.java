package multithreadingconcepts;

public class MyRunnable implements Runnable{
    @Override
    public  void run(){

        for (int i=0; i<5; i++){

            try{

                System.out.println( Thread.currentThread().getName());
                Thread.sleep(1000,10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
