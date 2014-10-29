package tweaking.concurrency;

import static java.lang.Thread.sleep;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer {
    
    private static int CURRENT_VALUE = 0;
    private static final int MAX_VALUE = 100;
    
    public static void main(String[] args) {
        
        final BlockingQueue sharedQ = new LinkedBlockingQueue(10);
        final Thread producer = new Thread(new Producer(sharedQ));
        final Thread consumer = new Thread(new Consumer(sharedQ));
        producer.start();
        consumer.start();
        
    }
    
    static class Producer implements Runnable {

        final BlockingQueue q;
        public Producer(BlockingQueue q) {
            this.q = q;
        }

        @Override
        public void run() {
            for (;CURRENT_VALUE < MAX_VALUE; CURRENT_VALUE++) {
                try {
                    q.put(CURRENT_VALUE);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Added " + CURRENT_VALUE + " to the sharedQ");
            }
        }
    }
    
    static class Consumer implements Runnable {

        final BlockingQueue q;

        public Consumer(BlockingQueue q) {
            this.q = q;
        }

        @Override
        public void run() {
            int i = 0;
            while (i < MAX_VALUE) {
                try {
                    System.out.println("Consumed " + q.take() + " from sharedQ");
                    sleep(200);
                    i++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
