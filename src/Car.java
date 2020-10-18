public abstract class Car implements Printable {

    private String name;
    private double volume;

    public Car(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }
}
