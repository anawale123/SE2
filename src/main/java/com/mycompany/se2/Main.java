/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.se2;

/**
 *
 * @author 44736
 */
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create manager
        Manager manager = new Manager("Manager X");

        // Create employees with roles and positions
        Employee employee1 = new Employee("Employee A", "Developer", "Junior");
        Employee employee2 = new Employee("Employee B", "Tester", "Senior");

        // Create department and add manager and employees
        Department department = new Department("IT Department", manager);
        department.addEmployee(employee1);
        department.addEmployee(employee2);

        // Create projects
        Project project1 = new Project("Project A", "Completed", department);
        Project project2 = new Project("Project B", "Ongoing", department);

        // Assign projects to completed or ongoing lists in the department
        department.addCompletedProject(project1);
        department.addOngoingProject(project2);

        // Input: Show completed or ongoing projects
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'completed' or 'ongoing' to show the list: ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("completed")) {
            displayProjectDetails(department.getCompletedProjects());
        } else if (input.equalsIgnoreCase("ongoing")) {
            displayProjectDetails(department.getOngoingProjects());
        } else {
            System.out.println("Invalid input. Please enter 'completed' or 'ongoing'.");
        }

        scanner.close();
    }

    private static void displayProjectDetails(List<Project> projects) {
        for (Project project : projects) {
            System.out.println("Project: " + project.getName());
            System.out.println("Status: " + project.getStatus());
            System.out.println("Department: " + project.getDepartment().getName());
            System.out.println("Manager: " + project.getDepartment().getManager().getName());
            System.out.println("Employees:");

            for (Employee employee : project.getDepartment().getEmployees()) {
                System.out.println("- " + employee.getName() + " (Role: " + employee.getRole() + ", Position: " + employee.getPosition() + ")");
            }

            System.out.println("----------");
        }
    }
}