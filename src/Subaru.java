public class Subaru extends Car {

    private double model;
    private String country;

    public Subaru(){

    }

    public Subaru(String name, double volume, double model, String country) {
        super(name, volume);
        this.model = model;
        this.country = country;
    }

    public double getModel() {
        return model;
    }

    public void setModel(double model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String print() {
        return (getName() + " " + getVolume() + " " + model + " " + country);

    }
}
