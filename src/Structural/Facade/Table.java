package Structural.Facade;

public class Table {

    private final TableTop tableTop = new TableTop();
    private final Legs legs = new Legs();
    private final Nightstand nightstand = new Nightstand();

    public void makeTable(String material){

        tableTop.produce(material);
        int needLegs;

        if (material.equals("Wood")) {
            needLegs = 2;
            nightstand.produce(material);
        } else {
            needLegs = 4;
        }
        legs.produce(needLegs, material);
    }
}
