package Behavioral.Visitor;

public interface Visitor {
    void visit(Button button);

    void visit(Table table);

    void visit(TextField textField);
}
