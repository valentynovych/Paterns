package Creational.Builder;

public class Table {
    private String tableTop;
    private Material material;
    private int legs;

    public void setTableTop(String tableTop) {
        this.tableTop = tableTop;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableTop='" + tableTop + '\'' +
                ", material=" + material +
                ", legs=" + legs +
                '}';
    }
}
