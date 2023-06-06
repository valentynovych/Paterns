package Behavioral.ChainOfResponsibility;

public abstract class Updater {
    private int severity;
    private Updater upSeverity;

    public Updater(int severity) {
        this.severity = severity;
    }

    public void setUpSeverity(Updater upSeverity) {
        this.upSeverity = upSeverity;
    }

    public void updateManager(String message, int level){
        if (level <= severity){
            update(message);
        }
        if (upSeverity != null && level > severity){
            upSeverity.updateManager(message, level);
        }
    }
    public abstract void update(String message);
}
