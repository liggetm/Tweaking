package tweaking.strategyPattern.example2;

public class Context {
    
    public int calculate(final Strategy strategy) {
        return strategy.executeStrategy();
    }
}
