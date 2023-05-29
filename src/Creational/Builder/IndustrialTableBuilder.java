package Creational.Builder;

public class IndustrialTableBuilder extends TableBuilder {
    @Override
    void buildTableTop() {
        table.setTableTop("Rectangular");
    }

    @Override
    void buildMaterial() {
        table.setMaterial(Material.METAL);
    }

    @Override
    void buildLegs() {
        table.setLegs(4);
    }
}
