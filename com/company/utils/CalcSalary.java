package com.company.utils;

import com.company.model.Employee;

import java.util.Scanner;

public class CalcSalary {

    Scanner sc = new Scanner(System.in);

    public double calcSalary(Employee employee) {
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        System.out.print("Enter tax: ");
        double tax = sc.nextDouble();

        System.out.print("Enter deduction: ");
        double deduction = sc.nextDouble();

        return (employee.getSalary() + bonus) - tax - deduction;
    }
}