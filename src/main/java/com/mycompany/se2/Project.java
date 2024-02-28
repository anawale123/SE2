/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.se2;

/**
 *
 * @author 44736
 */



public class Project {
    private String name;
    private String status;
    private Department department;

    public Project(String name, String status, Department department) {
        this.name = name;
        this.status = status;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Department getDepartment() {
        return department;
    }
}
