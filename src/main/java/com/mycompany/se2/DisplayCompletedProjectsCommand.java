/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.se2;

/**
 *
 * @author 44736
 */
public class DisplayCompletedProjectsCommand implements Command {
    private Department department;

    public DisplayCompletedProjectsCommand(Department department) {
        this.department = department;
    }

    @Override
    public void execute() {
        System.out.println("Completed Projects:");
        for (Project project : department.getCompletedProjects()) {
            displayProjectDetails(project);
        }
    }

    private void displayProjectDetails(Project project) {
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
