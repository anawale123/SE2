/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.se2;

/**
 *
 * @author 44736
 */
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Manager manager;
    private List<Employee> employees;
    private List<Project> completedProjects;
    private List<Project> ongoingProjects;

    public Department(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
        this.employees = new ArrayList<>();
        this.completedProjects = new ArrayList<>();
        this.ongoingProjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getCompletedProjects() {
        return completedProjects;
    }

    public List<Project> getOngoingProjects() {
        return ongoingProjects;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCompletedProject(Project project) {
        completedProjects.add(project);
    }

    public void addOngoingProject(Project project) {
        ongoingProjects.add(project);
    }
}
