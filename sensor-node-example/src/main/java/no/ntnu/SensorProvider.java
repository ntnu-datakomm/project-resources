package no.ntnu;

import no.ntnu.sensors.Sensor;
import no.ntnu.sensors.TemperatureSensor;

/**
 * Manages a collection of all available sensors
 */
public class SensorProvider {
    private static final double NORMAL_ROOM_TEMPERATURE = 23.3;
    private static final double MIN_ROOM_TEMPERATURE = 18;
    private static final double MAX_ROOM_TEMPERATURE = 26;
    private final TemperatureSensor temperatureSensor = new TemperatureSensor(NORMAL_ROOM_TEMPERATURE,
            MIN_ROOM_TEMPERATURE, MAX_ROOM_TEMPERATURE);

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
     *
     * @return Temperature sensor instance
     */
    public Sensor getTemperatureSensor() {
        return temperatureSensor;
    }
}
