package no.ntnu;

/**
 * Represents the whole application, including the logic.
 */
public class App {
    private static final long SLEEP_DURATION_MS = 2000;

    /**
     * Run the application, does not return, except if something goes wrong.
     */
    public void run() {
        while (true) {
            readSensorData();
            sendDataToServer();
            powerNap();
        }
    }

    private void readSensorData() {
        // TODO - implement
        System.out.println("Reading sensor data...");
    }

    private void sendDataToServer() {
        // TODO - implement
        System.out.println("Sending data to server...");
    }

    private void powerNap() {
        try {
            Thread.sleep(SLEEP_DURATION_MS);
        } catch (InterruptedException e) {
            System.out.println("Ooops, someone woke us up in the middle of a nap");
        }
    }
}
