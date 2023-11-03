package abstract_class_and_interface.transport.water_transport;

public class Boat extends WaterTransport {

    public Boat(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
                double speed, String destinationOfWaterTransport) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed, destinationOfWaterTransport);
    }

    @Override
    protected void fillingUp() {
        //Метод заправки човна
        super.fillingUp();
    }
}
