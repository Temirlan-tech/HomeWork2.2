public class Honda extends Car {

    public Honda(){

    }

    public Honda(String name, double volume) {
        super(name, volume);
    }

    @Override
    public String print() {
        return  (getName() + " " + getVolume());


    }
}
