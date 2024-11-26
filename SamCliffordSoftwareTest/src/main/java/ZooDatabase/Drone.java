package ZooDatabase;

public class Drone extends ZooTracked implements Contactable{
    private final int RadioFrequency;

    public int getRadioFrequency() {
        return RadioFrequency;
    }

    public Drone(String name, int GPStagID, int RadioFrequency) {
        super(name, GPStagID);
        this.RadioFrequency = RadioFrequency;
    }

    @Override
    public void contact(String message) {

    }
}
