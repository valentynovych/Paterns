package Behavioral.State;

public class Think implements Activity {
    @Override
    public void execute() {
        System.out.println("Player think about the next move ...");
    }
}
