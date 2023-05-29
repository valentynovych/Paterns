package Creational.Factory_method;

public class ElectricRepair implements Repairman {
    @Override
    public void repair() {
        System.out.println("I`m repair your electric");
    }
}
