package Behavioral.Memento;

public class DriverUpdater {
    public static void main(String[] args) throws InterruptedException {
        Driver newDriver = new Driver();
        newDriver.setVersion("Version 1.2");
        LocalRestore localRestore = new LocalRestore();
        System.out.println("Your driver now: \n" + newDriver);

        System.out.println("Driver have update to version 1.3");
        System.out.println("Before updating i want create a restore point");
        //save local version
        localRestore.setSave(newDriver.saveDriver());
        System.out.println("Restore point created \n" + newDriver);

        Thread.sleep(5000);
        newDriver.setVersion("Version 1.3");
        System.out.println("Update driver done");
        System.out.println(newDriver);

        Thread.sleep(5000);
        System.out.println("Driver version 1.3 crack to your system");
        System.out.println("Rolling back to after version");
        //downgrade to local version
        newDriver.downgrade(localRestore.getRestorePoints());

        System.out.println("Driver rollback is done:");
        System.out.println(newDriver);
    }
}
