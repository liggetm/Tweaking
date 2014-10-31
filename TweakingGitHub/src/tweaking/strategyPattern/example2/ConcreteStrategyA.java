package tweaking.strategyPattern.example2;

public class ConcreteStrategyA implements Strategy {
    
    private final int a;
    private final int b;

    public ConcreteStrategyA(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int executeStrategy() {
        System.out.println("...executing contrete strategy A (2 number multiplication)");
        return a * b;
    }
    
}
