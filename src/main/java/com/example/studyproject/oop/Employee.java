package com.example.studyproject.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Hometask12
 * <p>
 * First level:
 * 1. Create a class "Employee" with fields: full name, position, email, phone, salary, age.
 * 2.Make the class constructor populate these fields when the object is created.
 * 3.Inside the Employee class, write a method that prints information about the object to the console.
 * 4.Create an array of five employees. For example:
 * Person[] persArray = new Person[5];
 * First we declare an array of objects
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
 * then for each cell of the array we set an object
 * persArray[1] = new Person(…); …
 * persArray[4] = new Person(…);
 * 5. Using a loop, display information only about employees over 40 years old.
 */

@Data
@AllArgsConstructor
public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Peterson", "CEO", "peterson_john@gmail.com", "+494561234767", 7000, 55);
        employees[1] = new Employee("Ashton Kutcher", "Project Manager ", "kutcher@hotmail.com", "+49998884455", 2400, 42);
        employees[2] = new Employee("Jared Leto", "Business Analyst", "ja_leto@gmail.com", "+49997771234", 3100, 21);
        employees[3] = new Employee("Julia Sanina", "Java Software Engineer", "sanina-julia@gmail.com", "+49995554789", 2700, 28);
        employees[4] = new Employee("Audrey Tautou", "Accounting manager", "tautou@gmail.com", "+49994445896", 1760, 48);

        for (Employee employee : employees) {
            if (employee.age > 40) employee.print();
        }
    }
}
