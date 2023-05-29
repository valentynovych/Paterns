package Creational.Abstact_Factory.PianoMoving;

import Creational.Abstact_Factory.Loader;

public class PianoLoaders implements Loader {
    @Override
    public void load() {
        System.out.println("I`m loading piano");
    }
}
