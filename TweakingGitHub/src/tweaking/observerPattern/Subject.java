package tweaking.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private final List<Observer> activeObservers = new ArrayList<>();
    
    public void registerObserver(final Observer obs) {
        activeObservers.add(obs);
    }
    
    public void notifyObservers() {
        for (final Observer ob : activeObservers) {
            ob.notifyOfUpdates();
        }
    }
    
    public void deRegisterObserver(final Observer obs) {
        if (activeObservers.contains(obs)) {
            activeObservers.remove(obs);
        }
    }
}
