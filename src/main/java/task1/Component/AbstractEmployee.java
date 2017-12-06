package task1.Component;

import task1.Enum.EnumRole;
import task1.Enum.EnumSex;
import task1.Service.ValidatorsService;

public abstract class AbstractEmployee implements Employee {

    private final ValidatorsService validatorsService = new ValidatorsService();
    private final String employeeName;
    private final EnumRole employeeRole;
    private final String academy;
    private final EnumSex sex;
    private final String originCountry;
    private String email;


    public AbstractEmployee(String employeeName, EnumRole employeeRole, String academy, EnumSex sex, String originCountry, String email) {
        this.employeeName = validatorsService.isNameOrSurnameCorrect(employeeName);
        this.employeeRole = employeeRole;
        this.academy = academy;
        this.sex = sex;
        this.originCountry = originCountry;
        this.email = validatorsService.isEmailCorrect(email);
    }

    @Override
    public String getAcademy() {
        return academy;
    }

    @Override
    public EnumSex getSex() {
        return sex;
    }

    @Override
    public String getOriginCountry() {
        return originCountry;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public EnumRole getEmployeeRole() {
        return employeeRole;
    }
}
