package tweaking.observerPattern;

public class ConcreteObserver1 implements Observer {

    @Override
    public void notifyOfUpdates() {
        System.out.println("observer 1 notified of updates.");
    }
    
}
