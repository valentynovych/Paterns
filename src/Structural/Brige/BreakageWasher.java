package Structural.Brige;

public class BreakageWasher extends Repairing {
    protected BreakageWasher(Repairman repairman) {
        super(repairman);
    }

    @Override
    public void repairsWork() {
        System.out.println("Breakage fix washer machine in progress ....");
        repairman.repairingWork();
    }
}
