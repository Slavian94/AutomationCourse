package abstract_class_and_interface.transport.air_transport;

import abstract_class_and_interface.Fly;
import abstract_class_and_interface.transport.Transport;

public class AirTransport extends Transport implements Fly {

    protected double stayingInTheAir;
    protected double flightHeight;

    public AirTransport(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
                        double speed, double stayingInTheAir, double flightHeight) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed);
        this.stayingInTheAir = stayingInTheAir;
        this.flightHeight = flightHeight;
    }

    @Override
    public void flying() {

    }
}
