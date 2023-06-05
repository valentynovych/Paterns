package Behavioral.ChainOfResponsibility;

public class VisualUpdater extends Updater {
    public VisualUpdater(int severity) {
        super(severity);
    }

    @Override
    public void update(String message) {
        System.out.println(message + " : Update your visual frames");

    }
}
