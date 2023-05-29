package Creational.Abstact_Factory;

public interface MovingTeamFactory {
    Driver getDriver();
    Loader getLoader();
    Logistician getLogistician();
}
