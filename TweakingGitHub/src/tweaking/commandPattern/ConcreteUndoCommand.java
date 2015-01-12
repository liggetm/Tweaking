package tweaking.commandPattern;

public class ConcreteUndoCommand implements Command {
    
    private final Receiver receiver;

    public ConcreteUndoCommand(final Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.undoAction();  //delegate to the receiver who knows what to do
    }
    
}
