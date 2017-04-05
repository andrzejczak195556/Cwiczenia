package pl.comcleancode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Klasa licząca pensje pracowników
 */
public class EmployeeSalaryCalculator {

    private static FileManager fileManager;

    public EmployeeSalaryCalculator(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public List<Employee> getEmployees() {
        List<Employee> employees;
        employees = new LinkedList<>();
        employees.add(new Employee("Marek",2301,Sex.Male));
        employees.add(new Employee("Grazyna",1703,Sex.Female));
        employees.add(new Employee("John",12330,Sex.Male));
        employees.add(new Employee("Helena",300,Sex.Female));

        return employees;
    }


    public Integer getAverageEmployeeSalaryForGivenSex(List<Employee> employees, Sex sex) throws EmployeesNotFoundException {

        int totalSalary = 0;
        int numberOfEmployees = 0;

            for (Employee employee : employees) {
                if (employee.getSex() == sex) {
                    totalSalary += employee.getSalary();
                    numberOfEmployees++;
                }
            }

        if (numberOfEmployees == 0)
            throw new EmployeesNotFoundException("no employeesof given sex were found");

        int averageSalary = totalSalary/numberOfEmployees;

        return averageSalary;
    }

    public static void main(String[] args) {

        try {
        EmployeeSalaryCalculator sth = new EmployeeSalaryCalculator(new SalaryCalculatorFileManager());
        System.out.println("Srednia pensja dla mezczyzn to: ");

        Integer averageMaleSalary= null;

        try{
            averageMaleSalary = sth.getAverageEmployeeSalaryForGivenSex(sth.getEmployees(),Sex.Male);
        }catch (EmployeesNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        if(averageMaleSalary!=null) {
            System.out.println(averageMaleSalary);
        }
        System.out.println("A dla kobiet to: ");
        Integer averageFemaleSalary=null;
        try{
            averageFemaleSalary = sth.getAverageEmployeeSalaryForGivenSex(sth.getEmployees(),Sex.Female);
        }catch (EmployeesNotFoundException e){

            System.out.println(e.getMessage());
        }

        if(averageFemaleSalary!=null) {
            System.out.println(averageFemaleSalary);
        }


            if(averageMaleSalary>averageFemaleSalary){
                fileManager.writeToFile("something.txt", averageMaleSalary.toString());
            }
                // a jak nie to kobiety
            if(averageFemaleSalary>averageMaleSalary){
                fileManager.writeToFile("something.txt", averageFemaleSalary.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
