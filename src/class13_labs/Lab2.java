package class13_labs;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jones", "Tommy Lee", 123);
        Employee employee2 = new Employee("Hackman", "Gene", 234);
        Employee employee3 = new Employee("Witherspoon", "Reese", 123);
        
//        if (employee1.equals(employee3)) {
//            System.out.println("Employee1 and Employee3 are equal");
//        } else {
//            System.out.println("They are not equal");
//        }

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        for (Employee e : employees) {
            System.out.println(e.geteLastName() + ", " + e.geteFirstName());
        }
    }
}
