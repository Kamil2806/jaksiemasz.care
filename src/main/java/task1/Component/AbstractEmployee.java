package task1.Component;

import task1.Enum.EnumRole;
import task1.Enum.EnumSex;
import task1.Service.ValidatorsService;

public abstract class AbstractEmployee implements Employee {

    private String employeeName;
    private EnumRole employeeRole;
    private String academy;
    private EnumSex sex;
    private String originCountry;
    private String email;

    public AbstractEmployee(){}

    public AbstractEmployee(AbstractEmployeeBuilder builder) {
        if(builder == null) {
            return;
        }
        this.employeeName = builder.employeeName;
        this.academy = builder.academy;
        this.email = builder.email;
        this.employeeRole = builder.employeeRole;
        this.originCountry = builder.originCountry;
        this.sex = builder.sex;
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

    public static abstract class AbstractEmployeeBuilder<T> {

        private final ValidatorsService validatorsService = new ValidatorsService();
        private String employeeName;
        private EnumRole employeeRole;
        private String academy;
        private EnumSex sex;
        private String originCountry;
        private String email;

        public AbstractEmployeeBuilder() {}

        public T employeeName(String name) {
            this.employeeName = validatorsService.isNameOrSurnameCorrect(name);
            return (T) this;
        }

        public T employeeRole(EnumRole role) {
            this.employeeRole = role;
            return (T)this;
        }

        public T academy(String academy) {
            this.academy = academy;
            return (T) this;
        }

        public T sex(EnumSex sex) {
            this.sex = sex;
            return (T) this;
        }

        public T originCountry(String country) {
            this.originCountry = country;
            return (T) this;
        }

        public T email(String email) {
            this.email = validatorsService.isEmailCorrect(email);
            return (T) this;
        }

        public abstract Employee build();
    }
}
