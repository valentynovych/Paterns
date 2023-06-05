package Behavioral.ChainOfResponsibility;

public class SecurityUpdater extends Updater {
    public SecurityUpdater(int severity) {
        super(severity);
    }

    @Override
    public void update(String message) {
        System.out.println(message+ " : Update your security system");
    }
}
