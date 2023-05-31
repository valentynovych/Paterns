package Structural.Decorator;

public class KetchupDecorator implements HotDog {
    private HotDog hotDog;

    public KetchupDecorator(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public void giveHotDog() {
        hotDog.giveHotDog();
        System.out.println(" + ketchup");
    }
}
