package com.james.demo.Models;

public class Project {
    private String projectName;
    private String projectDescription;
    private String projectLink;

    public Project() {
    }

    public Project(String projectName, String projectDescription, String projectLink) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectLink = projectLink;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
