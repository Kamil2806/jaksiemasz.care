package task0.PersonGenerator;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        PersonGenerator generator = new PersonGenerator();

        generator.generate(25);

        Collections.sort(generator.getPersons());

        for (Person person : generator.getPersons()) {
            System.out.println(person.getName() + ", " + person.getSurname()
                    + ", " + person.getEmail() );
        }

    }
}
