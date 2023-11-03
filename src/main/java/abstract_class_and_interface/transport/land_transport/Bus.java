package abstract_class_and_interface.transport.land_transport;

public class Bus extends LandTransport {
    public Bus(String name, String color, int numberOfPassenger, String kindOfFuel, String material, double speed,
               int numberOfWheels, String destinationOfTransport) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed, numberOfWheels, destinationOfTransport);
    }

    @Override
    protected void fillingUp() {
        // Метод заправки автобуса
        super.fillingUp();
    }
}
