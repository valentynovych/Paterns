package Creational.Abstact_Factory.PianoMoving;

import Creational.Abstact_Factory.Logistician;

public class PianoLogistician implements Logistician {
    @Override
    public void menage() {
        System.out.println("I`m menages piano moving");
    }
}
