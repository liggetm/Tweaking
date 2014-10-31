package tweaking.strategyPattern.example2;

public class ConcreteStrategyB implements Strategy {
    private final int a;
    private final int b;
    private final int c;

    public ConcreteStrategyB(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int executeStrategy() {
        System.out.println("...executing strategy B (3 number addition)");
        return a + b + c;
    }
    
}
