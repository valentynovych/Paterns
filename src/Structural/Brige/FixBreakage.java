package Structural.Brige;

public class FixBreakage {
    public static void main(String[] args) {


        Repairing repairing = new BreakagePlumbing(new PlumbingRepairman());
        repairing.repairsWork();
        Repairing repairing1 = new BreakageWasher(new ApplianceRepairmen());
        repairing1.repairsWork();

    }
}