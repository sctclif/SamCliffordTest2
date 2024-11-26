package UI;

import java.awt.*;

public class MapMarkerSuper {
    protected Point position;
    protected int radius;
    protected Color color;
    public MapMarkerSuper(Point position) {
        this.position = position;

    }
    public void draw(Graphics g) {
        g.setColor(color);
        position.x = position.x - radius;
        position.y = position.y - radius;
        g.fillOval(position.x, position.y, radius*2, radius*2);
    }
}
