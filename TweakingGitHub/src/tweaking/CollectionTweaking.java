package tweaking;

import java.util.ArrayList;
import java.util.List;

public class CollectionTweaking {
    
    public static void main(final String[] args) {
        
        final List<String> collectionA = new ArrayList<>();
        final List<String> collectionB = new ArrayList<>();
        
        collectionA.add("a");
        collectionA.add("b");
        collectionA.add("c");

        collectionB.add("a");
        collectionB.add("b");
        collectionB.add("d");
        
        final boolean areSame = collectionA.containsAll(collectionB);
        
        System.out.println("containsAll returns " + areSame);
    }
    
    
}
