// Controller class to manage battery saver mode
public class BatterySaverController {

    private boolean batterySaverOn;

    public BatterySaverController() {
        this.batterySaverOn = false; // default mode is off
    }

    // Enable battery saver
    public void enableBatterySaver() {
        batterySaverOn = true;
        System.out.println("Battery Saver Mode Enabled");
    }

    // Disable battery saver
    public void disableBatterySaver() {
        batterySaverOn = false;
        System.out.println("Battery Saver Mode Disabled");
    }

    // Check current status
    public boolean isBatterySaverOn() {
        return batterySaverOn;
    }
}
