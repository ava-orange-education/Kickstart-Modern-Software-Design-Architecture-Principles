interface StateExample {
    void doSpecificAction(Context context);
}


class StateIdle implements StateExample {
    public void doSpecificAction(Context context) {
        System.out.println("Microplayer is in the Idle state.");
        context.setState(this);
    }
}
class StatePlaying implements StateExample {
    public void doSpecificAction(Context context) {
        System.out.println("Microplayer is in the Playing state.");
        context.setState(this);
    }
}
class StatePaused implements StateExample {
    public void doSpecificAction(Context context) {
        System.out.println("Microplayer is in the Paused state.");
        context.setState(this);
    }
}


class Context {
    private StateExample state;
    public void setState(StateExample state) {
        this.state = state;
    }
    public void performSpecificAction() {
        state.doSpecificAction(this);
    }
}


public class StatePatternExample {
    public static void main(String[] args) {
        Context microplayer = new Context();
        StateIdle idleState = new StateIdle();
        StatePlaying playingState = new StatePlaying();
        StatePaused pausedState = new StatePaused();

        microplayer.setState(idleState);
        microplayer.performSpecificAction();
        microplayer.setState(playingState);
        microplayer.performSpecificAction();
        
        microplayer.setState(pausedState);
        microplayer.performSpecificAction();
    }
}
