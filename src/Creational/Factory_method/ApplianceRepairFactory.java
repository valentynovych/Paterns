package Creational.Factory_method;

public class ApplianceRepairFactory implements RepairmenFactory {
    @Override
    public Repairman createRepairmen() {
        return new ApplianceRepair();
    }
}
