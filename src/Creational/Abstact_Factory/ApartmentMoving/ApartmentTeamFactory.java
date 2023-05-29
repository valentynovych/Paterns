package Creational.Abstact_Factory.ApartmentMoving;

import Creational.Abstact_Factory.Driver;
import Creational.Abstact_Factory.Loader;
import Creational.Abstact_Factory.Logistician;
import Creational.Abstact_Factory.MovingTeamFactory;

public class ApartmentTeamFactory implements MovingTeamFactory {
    @Override
    public Driver getDriver() {
        return new CarDriver();
    }

    @Override
    public Loader getLoader() {
        return new ApartmentLoader();
    }

    @Override
    public Logistician getLogistician() {
        return new ApartmentLogistician();
    }
}
