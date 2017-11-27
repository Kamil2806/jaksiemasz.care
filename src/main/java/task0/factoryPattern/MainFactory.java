package task0.factoryPattern;

public class MainFactory {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car VW = carFactory.getCar("VW");

        Car Audi = carFactory.getCar("AUDI");

        Car Opel = carFactory.getCar("OPEL");

        VW.getManufacturer();

        Audi.getManufacturer();

        Opel.getManufacturer();
    }
}
