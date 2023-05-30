package Structural.Brige;

public abstract class Repairing {
    protected Repairman repairman;

    protected Repairing(Repairman repairman){
        this.repairman = repairman;
    }
    public abstract void repairsWork();
}
