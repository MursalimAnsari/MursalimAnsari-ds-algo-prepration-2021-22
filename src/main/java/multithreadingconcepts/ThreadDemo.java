package multithreadingconcepts;

class ThreadDemo{

    public static void main(String[] args) {

//         MyThread t1= new MyThread();
//         t1.setName("mursu");
//         MyThread t2= new MyThread();
//         t2.setName("anu");// providing names to thread
//         t1.start();
//         t2.start();

//        MyRunnable r = new MyRunnable();
//        Thread t1= new Thread(r);
//        Thread t2= new Thread(r);
//
//        t1.start();
//        t1.setName("mursu");
//        t2.start();
//        t2.setName("anu");


        System.out.println("main thread");
         Thread thread1 = new Thread(new Thread2(), "thread1");
         thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        System.out.println("exiting main thread");

    }
}