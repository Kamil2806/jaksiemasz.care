package task1.Service;

import task0.personGenerator.exceptions.IllegalEmailArgumentException;
import task0.personGenerator.exceptions.IllegalNameOrSurnameArgumentException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorsService {

    public String isNameOrSurnameCorrect(String nor) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(nor.toLowerCase());
        if(matcher.matches()) {
            return nor;
        } else throw new IllegalNameOrSurnameArgumentException();
    }

    public String isEmailCorrect(String email) {
        Pattern pattern = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            return email;
        }else throw new IllegalEmailArgumentException();
    }
}
