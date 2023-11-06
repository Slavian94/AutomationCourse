package abstract_class_and_interface.animal.bird.flying;

public class Duck extends FlyingBird {
    public Duck(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        super(name, color, numberOfPassenger, kindOfFuel, material, voice);
    }

    @Override
    protected void sleeping() {
        super.sleeping();
    }

    @Override
    protected void eating() {
        super.eating();
    }

    @Override
    public void flying() {
        super.flying();
    }
}
