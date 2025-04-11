package oopsRevision.multiThreading;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run()
            {
                 for(int i=1 ; i<=10 ; i++)
                 {
                     System.out.println(i);
                     try
                     {
                         Thread.sleep(100);
                     }
                     catch(InterruptedException e)
                     {
                         e.printStackTrace();
                     }
                 }
            }
        });

        t1.start();
        t1.join(); // current thread(main) will stop and wait for t1 thread to complete

        System.out.println("hi there");


    }
}
