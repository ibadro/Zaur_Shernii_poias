package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// сортировка
public class Test2 {
    public static void main(String[] args) {
        List <Employee> List = new ArrayList<>();
        Employee emp1 = new Employee( 100, "zaur","tregulov", 134);
        Employee emp2 = new Employee( 12, "ilnur","badro", 1234);
        Employee emp3 = new Employee( 130, "ilnur","trov", 1123233);
        List.add(emp1);
        List.add(emp2);
        List.add(emp3);
        System.out.println("Before sorting \n" + List);
        Collections.sort(List);
        System.out.println("after sorting \n"+ List);
    }
}
class Employee implements Comparable<Employee>{
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

    @Override
    public int compareTo(Employee anotherEmp) { // сравниваем текущий обьект с обьктом в параметре
//        if(this.id==anotherEmp.id){
//            return 0;
//                    }
//        else if (this.id<anotherEmp.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }
       // return this.id- anotherEmp.id; // альтернативный вариант по id
        // return this.id.compareTo(anotherEmp,id); // альтернативный вариант по id но придется инт переделывать в интеджер
        return this.name.compareTo(anotherEmp.name); // сортировка по имени функциональности compareTo
}