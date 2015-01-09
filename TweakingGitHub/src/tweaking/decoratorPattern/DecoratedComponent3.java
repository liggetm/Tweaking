package tweaking.decoratorPattern;

public class DecoratedComponent3 extends DecoratedComponent {
    
    public DecoratedComponent3(final Component c) {
        super(c);
    }
    
    @Override
    public int doSomething() {
        return super.doSomething() + 30;
    }
    
}
