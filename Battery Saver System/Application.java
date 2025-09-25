// Main entry point for Battery Saver System backend
public class Application {
    public static void main(String[] args) {
        BatterySaverController batterySaver = new BatterySaverController();

        // Enable battery saver mode
        batterySaver.enableBatterySaver();

        // Check current status
        System.out.println("Battery Saver Status: " + (batterySaver.isBatterySaverOn() ? "ON" : "OFF"));

        // Disable battery saver mode
        batterySaver.disableBatterySaver();
        System.out.println("Battery Saver Status: " + (batterySaver.isBatterySaverOn() ? "ON" : "OFF"));
    }
}
