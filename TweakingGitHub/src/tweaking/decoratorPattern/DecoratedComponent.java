package tweaking.decoratorPattern;

public abstract class DecoratedComponent extends Component {
    
    private final Component c;
    
    public DecoratedComponent(final Component c) {
        this.c = c;
    }
    
    @Override
    public int doSomething() {
        return c.doSomething(); //delegate to c
    }
    
}
