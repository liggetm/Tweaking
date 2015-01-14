package tweaking.concurrency.reetrantLockExample;

import static java.lang.Thread.sleep;

public class ListAdderThread extends Thread {
    
    private final ThreadSafeArrayList<String> list;

    public ListAdderThread(final String name, final ThreadSafeArrayList<String> list) {
        this.list = list;
        setName(name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 10) {
            i++;
            list.set("stringToSet");
            try {
                sleep(100);
            } catch (InterruptedException ex) {
            //do nothing
            }
        }
    }
    
}
