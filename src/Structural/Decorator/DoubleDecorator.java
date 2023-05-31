package Structural.Decorator;

public class DoubleDecorator implements HotDog {
    private HotDog hotDog;
    public DoubleDecorator(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public void giveHotDog() {
        System.out.print("Double ");
        hotDog.giveHotDog();

    }
}
