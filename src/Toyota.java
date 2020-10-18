public  class Toyota extends Car {

    private String nameModel;
    private int amount;

    public Toyota(){
    }

    public Toyota(String name, String nameModel, double volume, int amount){
        super(name,volume);
        this.nameModel = nameModel;
        this.amount = amount;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String print() {
        return (getName() + " " + " " + nameModel + " " + getVolume() + " " + amount);

    }


}
