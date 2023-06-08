package Behavioral.Visitor;

public class ClientVisitor {
    public static void main(String[] args) {
        Button button = new Button();
        Table table = new Table();
        TextField textField = new TextField();

        Visitor visitor1 = new GetData();
        System.out.println("Visitor get action");
        visitor1.visit(button);
        visitor1.visit(table);
        visitor1.visit(textField);

        System.out.println("\n=====================================\n");

        System.out.println("Visitor put action");
        Visitor visitor2 = new PostData();
        visitor2.visit(button);
        visitor2.visit(table);
        visitor2.visit(textField);
    }
}
