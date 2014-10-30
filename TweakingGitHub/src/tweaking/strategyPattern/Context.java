package tweaking.strategyPattern;

public class Context {

    private Strategy contextStrategy;

    public Context(final Strategy concreteStrategyType) {
        this.contextStrategy = concreteStrategyType;
    }

    public void setContextStrategy(final Strategy contextStrategy) {
        this.contextStrategy = contextStrategy;
    }

    public String executeStrategy() {
        return this.contextStrategy.executeStrategy();
    }

}
