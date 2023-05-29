package Creational.Factory_method;

public class PlumbingRepairFactory implements RepairmenFactory {
    @Override
    public Repairman createRepairmen() {
        return new PlumbingRepair();
    }
}
