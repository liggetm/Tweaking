package tweaking.statePattern;

public class OffState implements State {

    @Override
    public void execute(final Context context) {
        System.out.println("Off ...switching on");
        context.setState(new OnState());
    }
    
}
