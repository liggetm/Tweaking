package tweaking.decoratorPattern;

public class DecoratorMain {
    
    public static void main(final String[] args){
        
        final Component nonDecorated = new OriginalComponent();
        final Component decorated = new DecoratedComponent2(nonDecorated);
        final Component doubleDecorated = new DecoratedComponent3(decorated);
        
        System.out.println("nonDecorated doSomething returns: " + nonDecorated.doSomething());
        System.out.println("decorated doSomething returns: " + decorated.doSomething());
        System.out.println("doubleDecorated doSomething returns: " + doubleDecorated.doSomething());
        
        /*
        Users of Component will be able to use any of original or the decorated
        */
        
    }
    
}
