package Behavioral.ChainOfResponsibility;

public class SettingsUpdater extends Updater {
    public SettingsUpdater(int severity) {
        super(severity);
    }

    @Override
    public void update(String message) {
        System.out.println(message + " : Update your settings");
    }
}
