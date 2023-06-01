package Structural.Flyweigth;

public class WhiteChecker implements Checker {
    String color;

    public WhiteChecker(String color) {
        this.color = color;
        System.err.println("Create a new object " + WhiteChecker.class);
    }

    @Override
    public void position(int horizontal, int vertical) {
        System.out.println( color + "Checker steps to position:( horizontal: " + horizontal + " vertical: " + vertical);
    }
}
