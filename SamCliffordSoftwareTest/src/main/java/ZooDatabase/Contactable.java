package ZooDatabase;
import static OutsideClasses.AlertSystem.alertADrone;
import static OutsideClasses.AlertSystem.alertAKeeper;

public interface Contactable {
    //this is essentially redundant but nice future functionality for contacting zoo objects
    public void contact(String message);
}

