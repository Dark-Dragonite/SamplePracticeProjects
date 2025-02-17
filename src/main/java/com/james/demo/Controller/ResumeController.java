package com.james.demo.Controller;

import com.james.demo.Models.DeveloperResume;
import com.james.demo.Services.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/resume")
    public String getResume(Model model) {
        DeveloperResume resume = resumeService.getResume();
        model.addAttribute("resume", resume);
        return "resume";
    }
}