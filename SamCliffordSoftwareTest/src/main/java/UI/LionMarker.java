package UI;

import ZooDatabase.Lion;

import java.awt.*;

public class LionMarker extends MapMarkerSuper{
    Lion lion;
    public LionMarker(Point position, Lion lion) {
        super(position);
        radius = 3;
        color = Color.red;
        this.lion = lion;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawString("Name: "+ lion.getName() + ", Age: " + lion.getAge(), position.x, position.y);
    }
}