package tweaking.commandPattern;

public class CommandMain {
    
    public static void main(final String[] args) {

        /*
        Client knows nothing about the receiver or the command detail
        only what is exposed by the invoker.
        */
        final Invoker invoker = new Invoker();
        invoker.doCommand();
        invoker.undoCommand();
    }
    
}
