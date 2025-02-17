package com.james.demo.Models;

import java.util.List;

public class DeveloperResume {
    private DeveloperInfo developerInfo;
    private String[] skills;
    private Project[] projects;
    private ExperienceSection[] experiences;

    // Constructor to initialize developerInfo
    public DeveloperResume() {
        this.developerInfo = new DeveloperInfo(); // Initialize developerInfo
    }

    // Getters and Setters
    public DeveloperInfo getDeveloperInfo() {
        return developerInfo;
    }

    public void setDeveloperInfo(DeveloperInfo developerInfo) {
        this.developerInfo = developerInfo;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Project[] getProjects() {
        return this.projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public ExperienceSection[] getExperiences() {
        return experiences;
    }

    public void setExperiences(ExperienceSection[] experiences) {
        this.experiences = experiences;
    }

}
