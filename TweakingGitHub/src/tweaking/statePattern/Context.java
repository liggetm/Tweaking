package tweaking.statePattern;

public class Context {
    
    private State state = new OffState();  //Initially off

    void setState(State state) {
        this.state = state;
        System.out.println("switching state...");
    }

    public void execute() {
        state.execute(this);
    }
    
}
