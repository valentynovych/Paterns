package Creational.Factory_method;

public class ElectricRepairFactory implements RepairmenFactory {
    @Override
    public Repairman createRepairmen() {
        return new ElectricRepair();
    }
}
