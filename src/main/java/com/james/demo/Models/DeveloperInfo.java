package com.james.demo.Models;

public class DeveloperInfo {
    private String name;
    private String title;
    private String bio;
    private String contactEmail;

    // No-argument constructor
    public DeveloperInfo() {
    }

    // Constructor with arguments
    public DeveloperInfo(String name, String title, String bio, String contactEmail) {
        this.name = name;
        this.title = title;
        this.bio = bio;
        this.contactEmail = contactEmail;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}