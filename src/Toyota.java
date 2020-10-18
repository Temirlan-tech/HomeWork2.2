public  class Toyota extends Car {

    public Toyota(){

    }

    public Toyota(String name, double volume){
        super(name,volume);
    }


    @Override
    public String print() {
        return (getName() + " "+ getVolume());

    }
}
