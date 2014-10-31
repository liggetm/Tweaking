package tweaking.statePattern;

public class OnState implements State {

    @Override
    public void execute(final Context context) {
        System.out.println("On ...switching off");
        context.setState(new OffState());
    }
    
}
