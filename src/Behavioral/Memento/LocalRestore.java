package Behavioral.Memento;

public class LocalRestore {
    private RestorePoints restorePoints;

    public void setSave(RestorePoints restorePoints) {
        this.restorePoints = restorePoints;
    }

    public RestorePoints getRestorePoints() {
        return restorePoints;
    }
}
