package com.test.javaeight;

import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    String firstName;
    String lastName;
    int dept;

    public Employee(String firstName, String lastName, int dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
}


public class SortEmployee {

    public static void main(String[] args) {
        Employee e5 = new Employee("Captain", "Marvel", 3);
        Employee e2 = new Employee("Scarlet", "Witch", 25);
        Employee e3 = new Employee("Iron", "Man", 3);
        Employee e4 = new Employee("Iron", "Heart", 1);
        Employee e1 = new Employee("Captain", "Marvel", 1);

        List<Employee> list = new ArrayList<Employee>();
        Collections.addAll(list, e1, e2, e3, e4, e5);
        //list.add(e1);list.add(e2);list.add(e3);

        //reverse sort by FirstName, then by lastname, then reverse sort by dept
        List<Employee> sorted = list.stream()
                .sorted(Comparator.comparing(Employee::getFirstName, Comparator.reverseOrder())
                        .thenComparing(Employee::getLastName)
                        .thenComparing(Employee::getDept, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        Iterator itr = sorted.iterator();
        while(itr.hasNext())
        {
            Employee e = (Employee) itr.next();
            System.out.println(e.getFirstName()+" "+e.getLastName()+" "+e.getDept());
        }
    }

}