package tweaking.strategyPattern.example1;

/*
 * Client is decoupled from concrete strategy via context.
 * Avoids switch/if-else statements that would need changed.
 * Promotes the open-closed principle, new strategy mean implementing Strategy only
*/
public class Client {
    
    public static void main(String[] args) {
        
        final Context context = new Context(new ConcreteStrategyA());
        System.out.println("executing strategy: " + context.executeStrategy());
        
        context.setContextStrategy(new ConcreteStrategyB());    //Normally set upon construction, not changed
        System.out.println("Toggled context strategy");
        
        System.out.println("executing strategy: " + context.executeStrategy());
    }
    
}
