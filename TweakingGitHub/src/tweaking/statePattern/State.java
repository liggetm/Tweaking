package tweaking.statePattern;

/*
 * Each concreate state switch the context to the next state after execution
 * that's why the context is passed in the execute method.
*/
public interface State {
    
    void execute(final Context context);
    
}
