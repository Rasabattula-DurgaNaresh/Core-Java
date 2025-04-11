package oopsRevision.multiThreading;

public class printEvenAndOdd {
    public int counter = 1;
    public static int NUM = 20;

    public void printOddNos()
    {
        synchronized (this)
        {
            while(counter < NUM)
            {
                while(counter%2 == 0)
                {
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                }

                System.out.print(counter + " ");
                counter++;
                notifyAll();
            }
        }

    }

    public void printEvenNos()
    {
        synchronized (this)
        {
            while(counter < NUM)
            {
                while(counter %2 !=0)
                {
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException e)
                    {
                        throw new RuntimeException();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        printEvenAndOdd p = new printEvenAndOdd();

        Thread evenT = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printEvenNos();
            }
        });

        Thread oddT = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printOddNos();
            }
        });

        evenT.start();
        oddT.start();
    }
}
