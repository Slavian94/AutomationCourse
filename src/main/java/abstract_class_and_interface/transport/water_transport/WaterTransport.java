package abstract_class_and_interface.transport.water_transport;

import abstract_class_and_interface.Swim;
import abstract_class_and_interface.transport.Transport;

public class WaterTransport extends Transport implements Swim {
    protected String destinationOfWaterTransport;

    public WaterTransport(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
                          double speed, String destinationOfWaterTransport) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed);
        this.destinationOfWaterTransport = destinationOfWaterTransport;
    }

    @Override
    public void swimming() {

    }
}
