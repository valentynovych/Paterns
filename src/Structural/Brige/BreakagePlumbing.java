package Structural.Brige;

public class BreakagePlumbing extends Repairing {
    public BreakagePlumbing(Repairman repairman) {
        super(repairman);
    }

    @Override
    public void repairsWork() {
        System.out.println("Fix breakage plumbing in progress ....");
        repairman.repairingWork();
    }
}
