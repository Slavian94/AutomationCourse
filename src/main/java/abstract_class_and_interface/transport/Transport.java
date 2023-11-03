package abstract_class_and_interface.transport;

public  abstract class Transport {
    protected String name;
    protected String color;
    protected int numberOfPassenger;
    protected String kindOfFuel;
    protected String material;
    protected double speed;

    public Transport(String name, String color, int numberOfPassenger, String kindOfFuel, String material, double speed) {
        this.name = name;
        this.color = color;
        this.numberOfPassenger = numberOfPassenger;
        this.kindOfFuel = kindOfFuel;
        this.material = material;
        this.speed = speed;
    }

    protected void fillingUp() {
        // метод заправки транспортного засобу
    }
}
