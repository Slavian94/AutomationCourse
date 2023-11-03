package abstract_class_and_interface.transport.water_transport;

public class Barge extends WaterTransport {
    public Barge(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
                 double speed, String destinationOfWaterTransport) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed, destinationOfWaterTransport);
    }

    @Override
    protected void fillingUp() {
        // Метод заправки баржі
        super.fillingUp();
    }
}
