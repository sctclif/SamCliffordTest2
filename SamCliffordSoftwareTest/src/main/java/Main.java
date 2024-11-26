import OutsideClasses.LocationSystem;
import UI.MainFrame;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MainFrame frame = new MainFrame();
        LocationSystem locationSystem = new LocationSystem();
        //Sometimes the motion works if theyre far away and sometimes it dosnt, but i cant find the issue within my own code.
        //I assuming this is just part of the lion simulation.
    }
}