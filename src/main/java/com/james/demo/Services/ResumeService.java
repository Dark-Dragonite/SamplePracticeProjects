package com.james.demo.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.james.demo.Models.DeveloperInfo;
import com.james.demo.Models.DeveloperResume;
import com.james.demo.Models.ExperienceSection;
import com.james.demo.Models.Project;
import com.james.demo.Models.Projects;

@Service
public class ResumeService {

    public DeveloperResume getResume() {
        DeveloperResume resume = new DeveloperResume();

        DeveloperInfo developerInfo = new DeveloperInfo(
                "Dark-Dragonite",
                "Full Stack Developer",
                "Passionate about building scalable web applications and solving complex problems.",
                "Dark.Dragonite@gmail.com");
        resume.setDeveloperInfo(developerInfo);

        String[] skills = new String[] { "Java", "Linux" };
        resume.setSkills(skills);

        ExperienceSection experience1 = new ExperienceSection("Company Name", "SWE1", "Jan 2020", "Nov 2020",
                "description1");
        ExperienceSection experience2 = new ExperienceSection("Company Name", "SWE1", "Jan 2020", "Nov 2020",
                "description2");
        ExperienceSection[] experiences = new ExperienceSection[] { experience1, experience2 };
        resume.setExperiences(experiences);

        List<Project> projectList = Arrays.asList(
                new Project("Project 1", "A web application for managing tasks.", "https://project1.com"),
                new Project("Project 2", "An e-commerce platform built with React and Spring Boot.",
                        "https://project2.com"));
        Project[] projects = projectList.toArray(new Project[0]);
        resume.setProjects(projects);

        return resume;
    }
}