package tweaking.statePattern;


/*
 * Client is decoupled from current state and it's implementation
*/
public class Client {

    public static void main(String[] args) {
        final Context c = new Context();
        c.execute();
        c.execute();
        c.execute();
        c.execute();
        c.execute();
    }

}
