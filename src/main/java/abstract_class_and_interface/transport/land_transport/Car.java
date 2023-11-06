package abstract_class_and_interface.transport.land_transport;

public class Car extends LandTransport {

    public Car(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
               double speed, int numberOfWheels, String destinationOfTransport) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed, numberOfWheels, destinationOfTransport);
    }

    @Override
    protected void fillingUp() {
        // Метод заправки машини
        super.fillingUp();
    }

    @Override
    public void moving() {
        super.moving();
    }
}
