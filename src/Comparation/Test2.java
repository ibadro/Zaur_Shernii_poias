package Comparation;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List <Employee> List = new ArrayList<>();
        Employee emp1 = new Employee( 100, "zaur","tregulov", 134);
        Employee emp2 = new Employee( 120, "ilnur","badro", 1234);
        Employee emp3 = new Employee( 130, "za ","trov", 1123233);
        List.add(emp1);
        List.add(emp2);
        List.add(emp3);
        System.out.println("Before sorting \n" + List);
    }
}
class Employee{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}