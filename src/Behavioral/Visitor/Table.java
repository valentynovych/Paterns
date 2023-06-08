package Behavioral.Visitor;

public class Table implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
