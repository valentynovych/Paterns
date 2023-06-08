package Behavioral.Visitor;

public class Button implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
