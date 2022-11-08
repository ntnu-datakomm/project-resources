package no.ntnu;

import no.ntnu.sensors.Sensor;
import no.ntnu.sensors.TemperatureSensor;

/**
 * Manages a collection of all available sensors
 */
public class SensorProvider {
    private final TemperatureSensor temperatureSensor = new TemperatureSensor();
    private SensorProvider() {
    }

    private static final SensorProvider instance = new SensorProvider();

    /**
     * @return Get a singleton instance of the class
     */
    public static SensorProvider getInstance() {
        return instance;
    }

    /**
     * Get access to the temperature sensor on the platform
     * @return Temperature sensor instance
     */
    public Sensor getTemperatureSensor() {
        return temperatureSensor;
    }
}
