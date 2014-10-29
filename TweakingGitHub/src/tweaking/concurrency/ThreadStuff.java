package tweaking.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadStuff {
    
    private static volatile int NUM_TO_CHECK = 0;   //toggle volatile to show/fix deadlock
    
    public static void main(String[] args) {
        new WaitingThread().start();
        new IncrementingThread().start();
    }
    
    private static class WaitingThread extends Thread {
        @Override
        public void run() {
            while (true) {
                if (NUM_TO_CHECK >= 4) {
                    break;
                }
            }
            System.out.println("My number is up :)");
        }
    }
    
    private static class IncrementingThread extends Thread {
        @Override
        public void run() {
            while (NUM_TO_CHECK < 11) {
                try {
                    NUM_TO_CHECK++;
                    System.out.println("NUM_TO_CHECK now " + NUM_TO_CHECK);
                    sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadStuff.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
