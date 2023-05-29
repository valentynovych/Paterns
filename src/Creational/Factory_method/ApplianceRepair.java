package Creational.Factory_method;

public class ApplianceRepair implements Repairman{
    @Override
    public void repair() {
        System.out.println("I`m repair your appliance");
    }
}
