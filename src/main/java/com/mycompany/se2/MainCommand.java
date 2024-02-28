/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.se2;

/**
 *
 * @author 44736
 */
import java.util.Scanner;

public class MainCommand {
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

        // Create the invoker
        ProjectInvoker invoker = new ProjectInvoker();

        // Input: Show completed or ongoing projects
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'completed' or 'ongoing' to show the list: ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("completed")) {
            invoker.setCommand(new DisplayCompletedProjectsCommand(department));
        } else if (input.equalsIgnoreCase("ongoing")) {
            invoker.setCommand(new DisplayOngoingProjectsCommand(department));
        } else {
            System.out.println("Invalid input. Please enter 'completed' or 'ongoing'.");
            return;
        }

        // Execute the command
        invoker.executeCommand();

        scanner.close();
    }
}
