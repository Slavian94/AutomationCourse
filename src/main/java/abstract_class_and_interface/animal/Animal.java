package abstract_class_and_interface.animal;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int numberOfPassenger;
    protected String kindOfFuel;
    protected String material;
    protected String voice;

    public Animal(String name, String color, int numberOfPassenger, String kindOfFuel, String material, String voice) {
        this.name = name;
        this.color = color;
        this.numberOfPassenger = numberOfPassenger;
        this.kindOfFuel = kindOfFuel;
        this.material = material;
        this.voice = voice;
    }

    protected void eating(){

    }

    protected void sleeping(){

    }

}
