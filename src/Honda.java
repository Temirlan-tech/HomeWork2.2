public class Honda extends Car {

    private int year;
    private String owner;

    public Honda(){

    }

    public Honda(String name, double volume,int year, String owner) {
        super(name, volume);
        this.year = year;
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String print() {
        return  (getName() + " " + " " + year + " " + getVolume() + " "+ owner);


    }
}
