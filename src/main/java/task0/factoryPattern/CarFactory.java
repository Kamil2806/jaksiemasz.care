package task0.factoryPattern;

public class CarFactory {

    public Car getCar(String m) {

        if(m == null) {
            return null;
        }
        if(m.equalsIgnoreCase("VW")) {
            return new VW();
        }
        else if(m.equalsIgnoreCase("AUDI")) {
            return new Audi();
        }
        else if(m.equalsIgnoreCase("OPEL")) {
            return new Opel();
        }

        return null;
    }

}
