package tweaking.strategyPattern.example2;

/*
 * Strategies have different parameters and are called independently through context
 * Avoids switch/if-else statements that would need changed.
 * Promotes the open-closed principle, new strategy mean implementing Strategy only
*/
public class Client {
    
    public static void main(String[] args) {

        final Context context = new Context();
        final int strategyAResult = context.calculate(new ConcreteStrategyA(8, 9));
        System.out.println("...strategyA result: " + strategyAResult);
        
        final int strategyBResult = context.calculate(new ConcreteStrategyB(8, 9, 10));
        System.out.println("...strategyB result: " + strategyBResult);
        
    }
    
}
