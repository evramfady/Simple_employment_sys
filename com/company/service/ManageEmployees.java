package com.company.service;

import com.company.model.Employee;
import com.company.utils.CalcSalary;

import java.util.Scanner;

public class ManageEmployees {
    Scanner sc = new Scanner(System.in);



    public Employee addEmployee() {

        Employee employee = new Employee();

        System.out.println("Enter Employee ID: ");
        employee.setId(sc.nextInt());
        sc.nextLine(); // clear buffer
        System.out.println("Enter Employee Name: ");
        employee.setName(sc.nextLine());
        System.out.println("Enter Employee Department: ");
        employee.setDepartment(sc.nextLine());
        System.out.println("Enter Employee Salary: ");
        employee.setSalary(sc.nextDouble());

        System.out.println("Employee added successfully 🎉🎉");

        return employee;
    }

    public void updateEmployee(Employee employee) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element you want to update: ");
        System.out.println("1. Employee ID");
        System.out.println("2. Employee Name");
        System.out.println("3. Employee Department");
        System.out.println("4. Employee Salary");
        System.out.print("Enter your choice: ");
        int element = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (element)
        {
            case 1:
                System.out.println("Enter Employee ID: ");
                employee.setId(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter Employee Name: ");
                employee.setName(sc.nextLine());
                break;
            case 3:
                System.out.println("Enter Employee Department: ");
                employee.setDepartment(sc.nextLine());
                break;
            case 4:
                System.out.println("Enter Employee Salary: ");
                employee.setSalary(sc.nextDouble());
                break;
            default:
                System.out.println("Invalid element number");
                break;
        }
        System.out.println("The desired data updated successfully");

    }

    public void deleteEmployee( Employee employee) {

        employee = null;
    }

    public void displayEmployee( Employee employee ) {

        System.out.println("Employee ID: " + employee.getID() );
        System.out.println("Employee Name: " + employee.getName() );
        System.out.println("Employee Department: " + employee.getDepartment() );
        System.out.println("Employee Salary: " + employee.getSalary() );

    }

    public void calcSalary(Employee employee) {

        CalcSalary salaryCalc = new CalcSalary();
        double finalSalary = salaryCalc.calcSalary(employee);
        System.out.printf("Final Salary: %.2f%n", finalSalary);
    }


    public void searchEmployee(Employee[] employees) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Search by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        int choice = sc.nextInt();
        sc.nextLine(); // Clear buffer

        boolean found = false;

        switch (choice) {
            case 1:
                System.out.print("Enter Employee ID: ");
                int searchId = sc.nextInt();
                for (Employee emp : employees) {
                    if (emp != null && emp.getID() == searchId) {
                        displayEmployee(emp);
                        found = true;
                        break;
                    }
                }

                break;

            case 2:
                System.out.print("Enter Employee Name: ");
                String searchName = sc.nextLine();
                for (Employee emp : employees) {
                    if (emp != null && emp.getName().equalsIgnoreCase(searchName)) {
                        displayEmployee(emp);
                        found = true;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

    }
}
