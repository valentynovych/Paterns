package Creational.Builder;

public class BuildMaster {
    TableBuilder tableBuilder;

    public void setTableBuilder(TableBuilder tableBuilder) {
        this.tableBuilder = tableBuilder;
    }

    Table buildTable(){
        tableBuilder.createTable();
        tableBuilder.buildTableTop();
        tableBuilder.buildMaterial();
        tableBuilder.buildLegs();

        Table table = tableBuilder.getTable();

        return table;
    }
}
