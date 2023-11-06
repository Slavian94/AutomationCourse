package abstract_class_and_interface.transport.air_transport;

public class AirBalloon extends AirTransport {
    public AirBalloon(String name, String color, int numberOfPassenger, String kindOfFuel, String material,
                      double speed, double stayingInTheAir, double flightHeight) {
        super(name, color, numberOfPassenger, kindOfFuel, material, speed, stayingInTheAir, flightHeight);
    }

    @Override
    protected void fillingUp() {
        //метод заправки газового балону в повітряної кулі
        super.fillingUp();
    }

}
