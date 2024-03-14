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

public class productandservices {
    private List<Project> ongoingProjects;


    public void removeOngoingProjects(int amount) {
       
        if (amount < 0 || amount > ongoingProjects.size()) {
            throw new IllegalArgumentException("Invalid amount");
        }

       
        ongoingProjects = ongoingProjects.subList(0, ongoingProjects.size() - amount);

        
    }
}