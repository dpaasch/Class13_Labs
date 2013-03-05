package class13_labs;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jones", "Tommy Lee", 123);
        Employee employee2 = new Employee("Hackman", "Gene", 234);
        Employee employee3 = new Employee("Witherspoon", "Reese", 123);
        Dog dog1 = new Dog("Fido", 3, "a");
        Dog dog2 = new Dog("Max ", 2, "b");

        List livingBeings = new ArrayList();
        livingBeings.add(employee1);
        livingBeings.add(employee2);
        livingBeings.add(employee3);
        livingBeings.add(dog1);
        livingBeings.add(dog2);

        for (int i = 0; i < livingBeings.size(); i++) {
            Object obj = livingBeings.get(i);
            if (obj instanceof Employee) {
                Employee e = (Employee) livingBeings.get(i);
                System.out.println(e.toString());
            } 
            if (obj instanceof Dog) {
                Dog d = (Dog) livingBeings.get(i);
                System.out.println(d.toString());
            }
        }
    }
}
