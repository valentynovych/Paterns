package Structural.Decorator;

public class MustardDecorator implements HotDog {
    private HotDog hotDog;

    public MustardDecorator(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public void giveHotDog() {
       hotDog.giveHotDog();
        System.out.println(" + mustard");
    }
}
