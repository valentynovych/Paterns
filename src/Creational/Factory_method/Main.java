package Creational.Factory_method;

public class Main {
    public static void main(String[] args) {

        RepairmenFactory repairmenFactory = createRepairmenBySpecialty("Electric"); //Electric || Plumbing || Appliance
        Repairman repairman = repairmenFactory.createRepairmen();
        repairman.repair();
    }

    static RepairmenFactory createRepairmenBySpecialty(String specialty){
        switch (specialty){
            case "Electric":
                return new ElectricRepairFactory();
            case "Plumbing":
                return new PlumbingRepairFactory();
            case "Appliance":
                return new ApplianceRepairFactory();
            default:
                throw new RuntimeException(specialty + " is unknown specialty repairman");
        }
    }
}