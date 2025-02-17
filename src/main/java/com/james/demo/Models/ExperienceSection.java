package com.james.demo.Models;

public class ExperienceSection {

    private String companyName;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;

    public ExperienceSection() {
    }

    public ExperienceSection(String companyName, String jobTitle, String start, String end, String description) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.startDate = start;
        this.endDate = end;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setDescription() {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
