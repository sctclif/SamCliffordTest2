package UI;

import ZooDatabase.Keeper;

import java.awt.*;

public class KeeperMarker extends MapMarkerSuper{
    Keeper keeper;
    public KeeperMarker(Point position, Keeper keeper) {
        super(position);
        radius = 2;
        color = Color.blue;
        this.keeper = keeper;
    }
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawString("Name: "+ keeper.getName() + ", Phone No.: " + keeper.getPhoneNumber(), position.x, position.y);
    }
}
