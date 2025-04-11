package oopsRevision.multiThreading;

public class canWeRestartAThread {
    public static void main(String [] args)
    {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                int n=1;
                while(n<=10){
                    System.out.println(n);
                    n++;
                }

            }
        });

        t1.start();
        t1.start(); //illegalTreadStateException will occur
    }
}
