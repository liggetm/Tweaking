package tweaking.observerPattern;

public class ObserverMain {
    
    public static void main(String[] varArgs) {
        
        final Subject theWatched = new Subject();
        final Observer watcher1 = new ConcreteObserver1();
        final Observer watcher2 = new ConcreteObserver2();
        
        theWatched.notifyObservers();   //no-one see nuffin
        theWatched.registerObserver(watcher1);
        theWatched.notifyObservers();   //watcher 1 should have notify called
        theWatched.registerObserver(watcher2);
        theWatched.notifyObservers();   //both watchers should have notify called
        theWatched.deRegisterObserver(watcher2);
        theWatched.notifyObservers();   //watcher 1 should have notify called
        theWatched.deRegisterObserver(watcher1);
        theWatched.notifyObservers();   //no-one see nuffin
    }
    
}
