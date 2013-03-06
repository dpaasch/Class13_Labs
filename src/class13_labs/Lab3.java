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

        /* What challenges does this present? How can you overcome these challenges?
         * Having to include "if" logic tends to make this a bit more rigid.  In
         * addition, I had to include a toString to be able to print out details
         * for the specific object.  The could be overcome by just creating
         * separate lists for tracking each of the different objects.  Not that 
         * this was not cool, being able to include different types of objects
         * within one list (something I did not know you could do).
         */
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
