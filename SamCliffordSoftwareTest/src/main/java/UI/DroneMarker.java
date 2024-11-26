package UI;

import ZooDatabase.Drone;

import java.awt.*;

public class DroneMarker extends MapMarkerSuper{
    Drone drone;
    public DroneMarker(Point position, Drone drone) {
        super(position);
        radius = 3;
        color = Color.black;
        this.drone = drone;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        position.x = position.x - radius/2;
        position.y = position.y - radius/2;
        g.fillRect(position.x, position.y, radius, radius);
        g.drawString("Name: "+ drone.getName() + ", Freq: " + drone.getRadioFrequency(), position.x, position.y);
    }

}