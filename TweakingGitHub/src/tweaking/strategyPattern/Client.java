package tweaking.strategyPattern;

public class Client {
    
    public static void main(String[] args) {
        
        final Context context = new Context(new ConcreteStrategyA());
        System.out.println("executing strategy: " + context.executeStrategy());
        
        context.setContextStrategy(new ConcreteStrategyB());    //Normally not done by client.
        System.out.println("Toggled strategy");
        
        System.out.println("executing strategy: " + context.executeStrategy());
    }
    
}
