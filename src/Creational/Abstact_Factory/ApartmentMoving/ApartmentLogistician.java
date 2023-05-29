package Creational.Abstact_Factory.ApartmentMoving;

import Creational.Abstact_Factory.Logistician;

public class ApartmentLogistician implements Logistician {
    @Override
    public void menage() {
        System.out.println("I`m menages apartments moving");
    }
}
