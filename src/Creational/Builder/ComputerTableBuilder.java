package Creational.Builder;

public class ComputerTableBuilder extends TableBuilder {
    @Override
    void buildTableTop() {
        table.setTableTop("Corner");
    }

    @Override
    void buildMaterial() {
        table.setMaterial(Material.WOOD);
    }

    @Override
    void buildLegs() {
        table.setLegs(3);
    }
}
