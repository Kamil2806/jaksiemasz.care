package task0.personGenerator;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        PersonGenerator generator = new PersonGenerator();

        generator.generate(25);

        Collections.sort(generator.getPersons());

        System.out.println(generator.getPersons());

    }
}
