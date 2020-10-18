public class Main {

    public static void main (String[] args) {
        System.out.println(createObject("Subaru", 2.0).print());

        System.out.println(createObject("Toyota", 2.5).print());

        System.out.println(createObject("Honda", 1.8).print());
    }

    private static Car createObject(String name, double volume) {
        if (name.equals(Subaru.class.getSimpleName())){
            return new Subaru (name, volume,200.5,"Japan");
        } else if (name.equals(Honda.class.getSimpleName())){
            return new Honda(name, volume,2010,"John");
        } else if (name.equals(Toyota.class.getSimpleName())){
            return new Toyota(name, "camry", volume,7000);
        } else {
            return new Car() {
                @Override
                public String print() {
                    System.out.println("111");

                    return null;
                }
            };
        }

    }

}
