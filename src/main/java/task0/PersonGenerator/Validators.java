package task0.PersonGenerator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

    public String isNameOrSurnameCorrect(String nor) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(nor.toLowerCase());
        if(matcher.matches()) {
            return nor;
        } else return "Wrong data format";
    }

    public String isEmailCorrect(String email) {
        Pattern pattern = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            return email;
        } else return "Wrong data format";
    }
}
