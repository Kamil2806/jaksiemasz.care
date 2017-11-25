package task0.factory.pattern;

public class VW implements Car {

    private static final String MANUFACTURER = "VW" ;


    @Override
    public void getManufacturer() {
        System.out.println("Manufacturer: VW");
    }
}
