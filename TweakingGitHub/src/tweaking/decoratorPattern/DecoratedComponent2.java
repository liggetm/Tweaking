package tweaking.decoratorPattern;

public class DecoratedComponent2 extends DecoratedComponent {
    
    public DecoratedComponent2(final Component c) {
        super(c);
    }
    
    @Override
    public int doSomething() {
        return super.doSomething() + 20;
    }
    
}
