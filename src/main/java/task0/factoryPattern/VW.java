package task0.factoryPattern;

public class VW implements Car {

    private static final String MANUFACTURER = "VW" ;


    @Override
    public void getManufacturer() {
        System.out.println("Manufacturer: VW");
    }
}
