package tweaking.commandPattern;

public class Invoker {
    private final Receiver receiver;
    
    public Invoker() {
        receiver = new Receiver();
    }

    public void doCommand() {
        new ConcreteDoCommand(receiver).execute();
    }
    
    public void undoCommand() {
        new ConcreteUndoCommand(receiver).execute();
    }

}
