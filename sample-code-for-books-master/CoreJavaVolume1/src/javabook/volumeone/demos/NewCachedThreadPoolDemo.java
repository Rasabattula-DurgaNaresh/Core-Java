package javabook.volumeone.demos;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class NewCachedThreadPoolDemo {
	public static void main(String... args) throws InterruptedException, ExecutionException{
        //creates cached thread pool
        ExecutorService exService = Executors.newCachedThreadPool();
        // runnable thread start to execute.
        exService.execute(new NewCachedThreadPoolDemo().new RunnableThread());
        //callable thread starts to execute
        Future<Integer> future=exService.submit(new NewCachedThreadPoolDemo().new CallableThread());
        //gets value of callable thread
        int val=future.get();
        System.out.println(val);
        //checks for thread termination
        boolean isTerminated=exService.isTerminated();
        System.out.println(isTerminated);
        // waits for termination for 30 seconds only
        exService.awaitTermination(30,TimeUnit.SECONDS);
        exService.shutdownNow();
    }
	
    //Callable thread
    class CallableThread implements Callable<Integer> {
        @Override
        public Integer call() {
            int cnt = 0;
            for (; cnt < 5; cnt++) {
                System.out.println("call:" + cnt);
            }
            return cnt;
        }
    }
    
    //Runnable thread
    class RunnableThread implements Runnable {
        @Override
        public void run() {
            int cnt = 0;
            for (; cnt < 5; cnt++) {
                System.out.println("run:" + cnt);
            }
        }
    }
}
//https://www.concretepage.com/java/newcachedthreadpool_java