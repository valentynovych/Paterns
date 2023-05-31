package Structural.Decorator;

public class Delivery {
    public static void main(String[] args) {
        HotDog hotDogDelivery = new DoubleDecorator(
                new  MustardDecorator(
                        new KetchupDecorator(
                                new HotDogOrders("Hot-Dog"))));

//        HotDog hotDogDelivery = new DoubleDecorator(
//                new  MustardDecorator(
//                        new HotDogOrders("Hot-Dog")));

//        HotDog hotDogDelivery = new  MustardDecorator(
//                new KetchupDecorator(
//                        new HotDogOrders("Hot-Dog")));

        hotDogDelivery.giveHotDog();
    }
}
