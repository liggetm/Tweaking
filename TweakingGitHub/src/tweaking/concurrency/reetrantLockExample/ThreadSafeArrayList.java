package tweaking.concurrency.reetrantLockExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/*
Uses a reentrant lock to add concurrency to a non-thread safe arraylist
*/
public class ThreadSafeArrayList<E> {

    private final ReentrantLock reLock = new ReentrantLock(true);
    private final List<E> backingList = new ArrayList<>();

    public void set(final E obj) {
        reLock.lock();
        try {
            backingList.add(obj);
            System.out.println("List added to by " + Thread.currentThread().getName());
        } finally {
            reLock.unlock();
        }
    }

}
