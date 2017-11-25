package task0.factory.pattern;

public class Opel implements Car {

    private static final String MANUFACTURER = "Opel" ;

    @Override
    public void getManufacturer() {
        System.out.println("Manufacturer: Opel");
    }
}
