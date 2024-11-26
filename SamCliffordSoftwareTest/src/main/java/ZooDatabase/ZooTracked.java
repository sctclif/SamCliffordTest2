package ZooDatabase;

import java.awt.*;

public class ZooTracked {
    //Super class of all tracked objects
    protected String name;
    protected int GPStagID;
    protected Point position;
    public ZooTracked(String name, int GPStagID) {
        this.name = name;
        this.GPStagID = GPStagID;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public int getGPStagID() {
        return GPStagID;
    }
}
