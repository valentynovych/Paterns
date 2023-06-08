package Behavioral.Visitor;

public class PostData implements Visitor {
    @Override
    public void visit(Button button) {
        System.out.println("I`m put button name to Button");
    }

    @Override
    public void visit(Table table) {
        System.out.println("I`m put table name to Table");
    }

    @Override
    public void visit(TextField textField) {
        System.out.println("I`m put text name to TextField");
    }
}
