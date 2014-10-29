package tweaking.concurrency;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerNotifyWait {

    private final static int MAX_QUEUE_LENGTH = 10;
    private final static int MAX_CONSUMED = 100;
    private final static Stack<Integer> workQueue = new Stack<>();
    private final static Producer producer = new Producer();
    private final static Consumer consumer = new Consumer(producer);

    public static void main(String[] args) {
        producer.start();
        consumer.start();
    }

    static class Producer extends Thread {

        @Override
        public void run() {
            System.out.println("Producer starting");

            for (int i = 0; i < MAX_CONSUMED; i++) {
                try {
                    putMessage(i);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumerNotifyWait.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Producer finishing");
        }

        public synchronized void putMessage(final int i) throws InterruptedException {
            if (workQueue.size() == MAX_QUEUE_LENGTH) {
                wait();
            }
            System.out.println("Producing..." + i);
            workQueue.push(i);
            notify();
        }

        public synchronized int getMessage() throws InterruptedException {
            if (workQueue.isEmpty()) {
                wait();
            }
            notify();   //This is needed, otherwise the  
            return workQueue.pop();
        }
    }

    static class Consumer extends Thread {  //All thread synch'ing done in producer!

        private final Producer p;

        public Consumer(Producer p) {
            this.p = p;
        }

        @Override
        public void run() {
            System.out.println("Consumer starting");
            int consumedTotal = 0;

            while (consumedTotal < MAX_CONSUMED) {
                try {
                    System.out.println("Consuming... " + p.getMessage());
                    consumedTotal++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProducerConsumerNotifyWait.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            System.out.println("Consumer finishing");
        }
    }

}
