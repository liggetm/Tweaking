package tweaking.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleNotifyWait {

    private static final Thread threadB = new ThreadB();
    private static final Thread threadA = new ThreadA();

    public static void main(String[] args) {    //Could do threadA's work in here
        threadA.start();    
        threadB.start();
    }

    static class ThreadA extends Thread {

        @Override
        public void run() {
            System.out.println("Started thread A");
            try {
                synchronized (threadB) {
                    threadB.wait();
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(SimpleNotifyWait.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Finished thread A");
        }

    }

    static class ThreadB extends Thread {

        @Override
        public void run() {
            System.out.println("Started thread B");

            synchronized (this) {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    sum += i;
                    System.out.println("Sum currently: " + sum);
                }
                notify();
            }

            System.out.println("Finished thread B");
        }
    }
    
}
