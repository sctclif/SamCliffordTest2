package ZooDatabase;

public class Keeper extends ZooTracked implements Contactable {

    private final String PhoneNumber;
    private int DistanceToNearestLion;

    public Keeper(String name, int GPStagID, String PhoneNumber) {
        super(name, GPStagID);
        this.PhoneNumber = PhoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }


    @Override
    public void contact(String message) {

    }

    public void setDistanceToNearestLion(int distanceToNearestLion) {
        DistanceToNearestLion = distanceToNearestLion;
    }
    public int getDistanceToNearestLion() {
        return DistanceToNearestLion;
    }
}
