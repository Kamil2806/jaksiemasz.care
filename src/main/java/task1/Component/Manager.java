package task1.Component;

public interface Manager extends Employee {

    void hire(Employee employee);

    void fire(Employee employee);

    boolean canHire();
}
