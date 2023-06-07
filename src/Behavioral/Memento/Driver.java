package Behavioral.Memento;

import java.util.Date;

public class Driver {
    private String version;
    private Date date;

    public void setVersion(String version){
        this.version = version;
        this.date = new Date();
    }

    public RestorePoints saveDriver(){
        return new RestorePoints(version);
    }

    public void downgrade(RestorePoints restorePoints){
        version = restorePoints.getVersion();
        date = restorePoints.getDate();
    }

    @Override
    public String toString() {
        return "Driver:" +
                "\nVersion: " + version +
                "\nDate:" + date + "\n";
    }
}
