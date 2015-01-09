package tweaking.observerPattern;

public class ConcreteObserver2 implements Observer {

    @Override
    public void notifyOfUpdates() {
        System.out.println("observer 2 notified of updates.");
    }
    
}
