package Behavioral.ChainOfResponsibility;

public class CheckUpdate {
    public static void main(String[] args) {
        Updater updater1 = new VisualUpdater(Severity.TRIVIAL);
        Updater updater2 = new SettingsUpdater(Severity.MAJOR);
        Updater updater3 = new SecurityUpdater(Severity.CRITICAL);

        updater1.setUpSeverity(updater2);
        updater2.setUpSeverity(updater3);

        updater1.updateManager("Check visual update", Severity.TRIVIAL);
        updater1.updateManager("Check settings update", Severity.MAJOR);
        updater1.updateManager("Check security update", Severity.CRITICAL);

    }
}
