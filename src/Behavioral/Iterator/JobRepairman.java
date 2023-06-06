package Behavioral.Iterator;

public class JobRepairman {
    public static void main(String[] args) {
        String[] applianceRepairType = {"Washer", "Dishwasher", "Oven", "Fridge", "Stove", "Furnace"};
        Repairmen repairmen = new Repairmen("Artificer", applianceRepairType);

        Iterator iterator = repairmen.getIterator();
        System.out.println("Specialist: " + repairmen.getSpecialty());

        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
    }
}
