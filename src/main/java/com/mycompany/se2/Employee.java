/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.se2;

/**
 *
 * @author 44736
 */
public class Employee {
    private String name;
    private String role;
    private String position;

    public Employee(String name, String role, String position) {
        this.name = name;
        this.role = role;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getPosition() {
        return position;
    }
}
