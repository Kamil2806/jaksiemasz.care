package task0.personGenerator;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PersonGenerator {

    private List<Person> persons = Lists.newArrayList();
    private List<String>names = Lists.newArrayList(
            "Kamil", "Bogdan", "Magda", "Janek", "Gabrysia");
    private List<String> surnames = Lists.newArrayList(
            "Nowak", "Kowalski", "Ser", "Szynka", "Grucha");
    private List<String> emails = Lists.newArrayList(
            "k@wp.pl", "m@o2.pl", "z@onet.pl", "o@gmail.com", "i@o2.pl");
    private Random random = new Random();

    public void generate(Integer numberOfPerson) {

        for(int i = 0; i < numberOfPerson; i++) {
            persons.add(new Person(names.get(random.nextInt(names.size())),
                                    surnames.get(random.nextInt(surnames.size())),
                                    emails.get(random.nextInt(emails.size()))));
        }
    }

    public List<Person> getPersons() {
        return persons;
    }

}
