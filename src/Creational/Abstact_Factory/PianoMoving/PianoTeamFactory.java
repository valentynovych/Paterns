package Creational.Abstact_Factory.PianoMoving;

import Creational.Abstact_Factory.Driver;
import Creational.Abstact_Factory.Loader;
import Creational.Abstact_Factory.Logistician;
import Creational.Abstact_Factory.MovingTeamFactory;

public class PianoTeamFactory implements MovingTeamFactory {
    @Override
    public Driver getDriver() {
        return new TruckDriver();
    }

    @Override
    public Loader getLoader() {
        return new PianoLoaders();
    }

    @Override
    public Logistician getLogistician() {
        return new PianoLogistician();
    }
}
