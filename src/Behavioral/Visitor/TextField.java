package Behavioral.Visitor;

public class TextField implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
