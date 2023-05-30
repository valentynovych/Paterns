package Creational.Builder;

public class BuildMaster {
    private TableBuilder tableBuilder;

    public void setTableBuilder(TableBuilder tableBuilder) {
        this.tableBuilder = tableBuilder;
    }

    public Table buildTable(){
        tableBuilder.createTable();
        tableBuilder.buildTableTop();
        tableBuilder.buildMaterial();
        tableBuilder.buildLegs();

        Table table = tableBuilder.getTable();

        return table;
    }
}
