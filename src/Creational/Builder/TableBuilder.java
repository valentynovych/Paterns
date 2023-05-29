package Creational.Builder;

public abstract class TableBuilder {
    Table table;

    void createTable(){
        table = new Table();
    }

    abstract void buildTableTop();
    abstract void buildMaterial();
    abstract void buildLegs();

    Table getTable(){
        return table;
    }

}
