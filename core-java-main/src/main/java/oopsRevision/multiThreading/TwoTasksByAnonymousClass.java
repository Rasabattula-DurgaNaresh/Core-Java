package oopsRevision.multiThreading;

public class TwoTasksByAnonymousClass {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("hello");
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                System.out.println("world");
            }
        };

        t1.start();
        t2.start();

    }
}
