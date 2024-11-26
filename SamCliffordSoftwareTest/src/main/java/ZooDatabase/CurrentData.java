package ZooDatabase;

import java.util.ArrayList;

public class CurrentData {
    ArrayList<Keeper> keepers = new ArrayList<>();
    ArrayList<Lion> lions = new ArrayList<>();
    ArrayList<Drone> drones = new ArrayList<>();
    public CurrentData() {

    }
    public ArrayList<Keeper> generateKeepers() {
        keepers.add(new Keeper("Geoff", 80, "4392"));
        //add more keepers
        return keepers;
    }
    public ArrayList<Lion> generateLions() {
        lions.add(new Lion("Simba", 30, 7));
        //add more lions
        return lions;
    }
    public ArrayList<Drone> generateDrones() {
        drones.add(new Drone("Monitor1", 124, 128));//radio frequency in megahertz
        //add more drones
        return drones;
    }
}
