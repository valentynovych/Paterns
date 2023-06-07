package Behavioral.State;

public class Win implements Activity {
    @Override
    public void execute() {
        System.err.println("Player Win this game !!!!");
    }
}
