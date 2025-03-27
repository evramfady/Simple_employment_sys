package com.company.main;

import java.util.Scanner;

import com.company.service.ManageEmployees;
import com.company.model.Employee;

public class Main_employees
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ManageEmployees manageEmployees = new ManageEmployees();

        System.out.println("Welcome to Employee Management System 🙌🏻");

        Employee[] employees = new Employee[100];
        int operation, count = 1;

        System.out.println("Enter the number of employees you want to add: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Employee emp = manageEmployees.addEmployee();
            employees[count++] = emp;
        }


        while (true) {

            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employee");
            System.out.println("5. Calculate Salary");
            System.out.println("6. Search Employee");
            System.out.println("7. Exit");
            System.out.println("Enter the number of the operation you want to perform: ");
            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Enter the number of employees you want to add: ");
                    num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        Employee emp = manageEmployees.addEmployee();
                        employees[count++] = emp;
                    }
                    break;
                case 2:
                    System.out.print("Enter employee index to update: ");
                    int updateIndex = sc.nextInt();
                    if (updateIndex >= 0 && updateIndex < count && employees[updateIndex] != null) {
                        manageEmployees.updateEmployee(employees[updateIndex]);
                    } else {
                        System.out.println("Invalid index or employee does not exist.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of employee you want to delete: ");
                    int deleteIndex = sc.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < count) {
                        manageEmployees.deleteEmployee(employees[deleteIndex]);
                        System.out.println("Employee deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the number of employee you want to display: ");
                    int displayIndex = sc.nextInt();
                    if (displayIndex >= 0 && displayIndex < count && employees[displayIndex] != null) {
                        manageEmployees.displayEmployee(employees[displayIndex]);
                    } else {
                        System.out.println("Invalid index or employee does not exist.");
                    }
                    break;
                case 5:
                    System.out.println("Enter the number of employee you want to calculate salary: ");
                    int salaryIndex = sc.nextInt();
                    if (salaryIndex >= 0 && salaryIndex < count && employees[salaryIndex] != null) {
                        manageEmployees.calcSalary(employees[salaryIndex]);
                    } else {
                        System.out.println("Invalid index or employee does not exist.");
                    }
                    break;
                case 6:
                    manageEmployees.searchEmployee(employees);
                    break;
                case 7:
                    System.out.println("Bye Bye! Have a nice day 👋🏻👋🏻");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation number");
                    break;
            }
        }
    }
}
