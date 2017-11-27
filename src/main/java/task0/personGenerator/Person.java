package task0.personGenerator;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private String email;
    private final Validators validators = new Validators();

    public Person(String name, String surname, String email) {
        this.name = validators.isNameOrSurnameCorrect(name);
        this.surname = validators.isNameOrSurnameCorrect(surname);
        this.email = validators.isEmailCorrect(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validators.isNameOrSurnameCorrect(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = validators.isNameOrSurnameCorrect(surname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = validators.isEmailCorrect(email);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Email: " + email + "\n";
    }

    @Override
    public int compareTo(Person p) {
        int nameComparision = name.compareTo(p.name);
        int surnameComparision = surname.compareTo(p.surname);

        if (nameComparision == 0) {
            return surnameComparision;
        }

        else if (nameComparision == 0 && surnameComparision ==0) {
            return email.compareTo(p.email);
        }

        else return nameComparision;
    }
}
