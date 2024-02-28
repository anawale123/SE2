/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.se2;

/**
 *
 * @author 44736
 */

public class CompleteProjectCommand implements Command {
    private Project project;

    public CompleteProjectCommand(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.complete();
    }
}
