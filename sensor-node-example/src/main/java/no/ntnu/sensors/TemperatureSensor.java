package no.ntnu.sensors;

/**
 * Imitates a temperature sensor, providing realistic temperatures
 */
public class TemperatureSensor implements Sensor {
    @Override
    public double readValue() {
        return 22.3;
    }
}
