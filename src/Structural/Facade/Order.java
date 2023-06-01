package Structural.Facade;

public class Order {
    public static void main(String[] args) {

        Table table = new Table();
        table.makeTable("Wood");
        System.out.println(" ");
        table.makeTable("Metal");
    }
}
