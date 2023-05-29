package Creational.Abstact_Factory.ApartmentMoving;


import Creational.Abstact_Factory.Driver;

public class CarDriver implements Driver{
    @Override
    public void drive() {
        System.out.println("I`m driving ease car");
    }
}
