package multithreadingconcepts;



public class MyThread  extends Thread{

    @Override
    public void run(){

        for (int i=0; i<5;i++) {

            try {

                System.out.println(Thread.currentThread() + " : " + "child thread");
                Thread.sleep(500);

            } catch (InterruptedException ec) {
                ec.printStackTrace();
            }
        }
    }

}




