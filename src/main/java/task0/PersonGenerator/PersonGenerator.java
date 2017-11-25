package task0.PersonGenerator;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PersonGenerator {

    private List<Person> persons = new LinkedList<>();
    private String[] name = {"Kamil", "Bogdan", "Magda", "Janek", "Gabrysia"};
    private String[] surname = {"Nowak", "Kowalski", "Ser", "Szynka", "Masło"};
    private String[] email = {"k@wp.pl", "m@o2.pl", "z@onet.pl", "o@gmail.com", "i@o2.pl"};
    private Random random = new Random();

    public void generate(Integer numberOfPerson) {

        for(int i = 0; i < numberOfPerson; i++) {
            persons.add(new Person(name[random.nextInt(4)], surname[random.nextInt(4)]
            ,email[random.nextInt(4)]));
        }
    }

    public List<Person> getPersons() {
        return persons;
    }

}
