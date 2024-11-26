package UI;

import ZooDatabase.CurrentData;
import ZooDatabase.Drone;
import ZooDatabase.Keeper;
import ZooDatabase.Lion;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import static OutsideClasses.AlertSystem.alertADrone;
import static OutsideClasses.AlertSystem.alertAKeeper;

public class MainFrame extends JFrame {
    static GraphicsConfiguration gc;
    private CurrentData cd = new CurrentData();
    ArrayList<Lion> lions;
    ArrayList<Keeper> keepers;
    ArrayList<Drone> drones;
    public MainFrame() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setResizable(false);

        //IMPORT CURRENT DATA
        lions = cd.generateLions();
        keepers = cd.generateKeepers();
        drones = cd.generateDrones();


        MapCanvas canvas = new MapCanvas(lions, keepers, drones);
        add(canvas);

        setVisible(true);
        while(true) {//Main Running Loop
            canvas.updateLoop();

            updateKeeperDistances();
            checkAlert();
            try {Thread.sleep(1000);}
            catch(Exception e){}
        }
    }

    public void updateKeeperDistances(){
        for(Keeper k : keepers){
            int[] distance = new int[lions.size()];
            int i =0 ;//create a array of distances
            for(Lion l : lions){
                distance[i] = (int) Math.hypot(Math.abs(k.getPosition().x - l.getPosition().x), Math.abs(k.getPosition().y - l.getPosition().y));
                i++;
            }
            // find min of array
            int min = distance[0];
            for(int num : distance) {
                if (num < min){
                    min = num;
                }
            }
            k.setDistanceToNearestLion(min);
            //UNCOMMENT TO SHOW LIVE DISTANCE FEED
            //System.out.println("Distance: "+k.getDistanceToNearestLion());
        }
    }

    public void checkAlert(){
        //alert if things are close
        for(Keeper k : keepers){//for all future keepers
            if(k.getDistanceToNearestLion() < 60){
                alertAKeeper((k.getPhoneNumber()));
                alertADrone(drones.get(0).getRadioFrequency());//just contact first drone
            }
        }
    }
}
