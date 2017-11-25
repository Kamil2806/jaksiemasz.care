package task0.factory.pattern;

public class Audi implements Car {

    private static final String MANUFACTURER = "Audi" ;

    @Override
    public void getManufacturer() {
        System.out.println("Manufacturer: Audi");
    }
}
