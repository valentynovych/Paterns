package Structural.Decorator;

public class HotDogOrders implements HotDog {
    private String order;

    public HotDogOrders(String order) {
        this.order = order;
    }

    @Override
    public void giveHotDog() {
        System.out.println(order);
    }
}
