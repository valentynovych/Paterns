package Creational.Abstact_Factory;

import Creational.Abstact_Factory.ApartmentMoving.ApartmentTeamFactory;
import Creational.Abstact_Factory.PianoMoving.PianoTeamFactory;

public class NeedMoving {
    public static void main(String[] args) {
        MovingTeamFactory pianoTeamFactory = new PianoTeamFactory();
        Driver carDriver = pianoTeamFactory.getDriver();
        Loader pianoLoader = pianoTeamFactory.getLoader();
        Logistician pianoLogistician = pianoTeamFactory.getLogistician();

        System.out.println("Execute piano moving");
        carDriver.drive();
        pianoLoader.load();
        pianoLogistician.menage();
        System.out.println("- - - - - - - - - - - ");

        MovingTeamFactory apartmentTeamFactory = new ApartmentTeamFactory();
        Driver apartmenDriver = apartmentTeamFactory.getDriver();
        Loader apartmenLoader = apartmentTeamFactory.getLoader();
        Logistician apartmenLogistician = apartmentTeamFactory.getLogistician();

        System.out.println("Execute apartment moving");
        apartmenDriver.drive();
        apartmenLoader.load();
        apartmenLogistician.menage();

    }
}
