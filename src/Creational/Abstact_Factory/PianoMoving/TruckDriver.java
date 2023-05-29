package Creational.Abstact_Factory.PianoMoving;

import Creational.Abstact_Factory.Driver;

public class TruckDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("I`m drive track on piano moving");
    }
}
