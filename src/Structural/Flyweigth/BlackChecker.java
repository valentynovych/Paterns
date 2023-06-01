package Structural.Flyweigth;

public class BlackChecker implements Checker {
    String color;

    public BlackChecker(String color) {
        this.color = color;
        System.err.println("Create a new object " + BlackChecker.class);
    }

    @Override
    public void position(int horizontal, int vertical) {
        System.out.println( color + "Checker steps to position:( horizontal: " + horizontal + " vertical: " + vertical);
    }
}
