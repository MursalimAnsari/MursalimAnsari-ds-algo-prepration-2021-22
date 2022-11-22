package multithreadingconcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class ExecutorServiceRunner {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);


        executorService.execute(newRunnable("Task 1"));
        executorService.execute(newRunnable("Task 2"));
        executorService1.execute(newRunnable("Task 3"));
        executorService.execute(newRunnable("Task 4"));
        executorService1.execute(newRunnable("Task 5"));
        executorService1.execute(newRunnable("Task 6"));

        // If we do not shut down the executor service it will always be executing...
        executorService.shutdown();
        executorService1.shutdown();

    }

    private static Runnable newRunnable(String msg) {


        // anonymous inner class
        return new Runnable() {
            @Override
            public void run() {
                String completeMsg =
                        Thread.currentThread().getName() +
                                ": " + msg;
                System.out.println(completeMsg);
            }
        };
    }

}