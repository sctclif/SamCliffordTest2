package UI;

import OutsideClasses.LocationSystem;
import ZooDatabase.Drone;
import ZooDatabase.Keeper;
import ZooDatabase.Lion;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;


public class MapCanvas extends Canvas {
    private final LocationSystem locationSystem = new LocationSystem();

    private final ArrayList<Keeper> keepers;
    private final ArrayList<Lion> lions;
    private final ArrayList<Drone> drones;



    private final ArrayList<MapMarkerSuper> markersToDraw = new ArrayList<>();

    public MapCanvas(ArrayList<Lion> lion, ArrayList<Keeper> keeper, ArrayList<Drone> drone) throws IOException {
        this.lions = lion;
        this.keepers = keeper;
        this.drones = drone;
        setBackground(Color.ORANGE);
            setVisible(true);
    }

    public void paint(Graphics g) {

        for (MapMarkerSuper m : markersToDraw) {
            m.draw(g);
        }
    }

    public void updateLoop() throws IOException {
        markersToDraw.clear();//map canvas clear
        //.clear();//map canvas clear
        updateDroneLoc();
        updateKeeperLoc();
        updateLionLoc();
        //UNCOMMENT TO SHOW LIVE POSITION FEED
//        System.out.println("POSITION UPDATE");
//        for (MapMarkerSuper m : markersToDraw) {
//            System.out.println(m.getClass() + ": " + m.position.x + " " + m.position.y);
//        }
        repaint();
    }

    public void updateLionLoc() throws IOException {
        //update lionLoc with data
        for (Lion l : lions){
            markersToDraw.add(new LionMarker(locationSystem.getCoords(l.getGPStagID()), l));
            l.setPosition(locationSystem.getCoords(l.getGPStagID()));
        }

    }

    public void updateKeeperLoc() throws IOException {
        //update KeeperLoc with data
        for (Keeper k : keepers){
            markersToDraw.add(new KeeperMarker(locationSystem.getCoords(k.getGPStagID()), k));
            k.setPosition(locationSystem.getCoords(k.getGPStagID()));
        }
    }

    public void updateDroneLoc() throws IOException {
        //update DroneLoc with data
        for (Drone d : drones){
            markersToDraw.add(new DroneMarker(locationSystem.getCoords(d.getGPStagID()),d));
            d.setPosition(locationSystem.getCoords(d.getGPStagID()));
        }
    }






}
