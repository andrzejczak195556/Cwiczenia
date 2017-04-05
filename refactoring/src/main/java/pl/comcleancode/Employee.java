package pl.comcleancode;

/**
 * Created by miszel on 3/22/17.
 */
public class Employee
{
    private String name;
    private int salary;
    private Sex sex;

    public Employee(String name, int salary, Sex sex) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }
}
