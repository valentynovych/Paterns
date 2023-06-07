package Behavioral.Memento;

import java.util.Date;

public class RestorePoints {
    private final String version;
    private final Date date;

    public RestorePoints(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
