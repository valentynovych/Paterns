package Behavioral.Visitor;

public class GetData implements Visitor {
    @Override
    public void visit(Button button) {
        System.out.println("I`m get button name");
    }

    @Override
    public void visit(Table table) {
        System.out.println("I`m get table name with Table");
    }

    @Override
    public void visit(TextField textField) {
        System.out.println("I`m get text name with textField");
    }
}
