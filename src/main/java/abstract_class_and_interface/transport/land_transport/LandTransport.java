package abstract_class_and_interface.transport.land_transport;

import abstract_class_and_interface.transport.Transport;

public class LandTransport extends Transport {
    protected int numberOfWheels;
    protected String destinationOfTransport;

    public LandTransport(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
                         double speed, int numberOfWheels, String destinationOfTransport) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed);
        this.numberOfWheels = numberOfWheels;
        this.destinationOfTransport = destinationOfTransport;
    }
}
