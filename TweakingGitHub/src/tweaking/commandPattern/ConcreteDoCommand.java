package tweaking.commandPattern;

public class ConcreteDoCommand implements Command {
    
    private final Receiver receiver;

    public ConcreteDoCommand(final Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.action();  //delegate to the receiver who knows what to do
    }
    
}
