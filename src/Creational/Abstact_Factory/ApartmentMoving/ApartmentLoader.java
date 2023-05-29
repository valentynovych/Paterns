package Creational.Abstact_Factory.ApartmentMoving;

import Creational.Abstact_Factory.Loader;

public class ApartmentLoader implements Loader {
    @Override
    public void load() {
        System.out.println("I`m loading apartments");
    }
}
