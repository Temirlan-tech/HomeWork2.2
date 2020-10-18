public class Subaru extends Car {

    public Subaru(){

    }

    public Subaru(String name, double volume) {
        super(name, volume);
    }

    @Override
    public String print() {
        return (getName() + " " + getVolume());

    }
}
