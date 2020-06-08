package com.example.site.ems.controller;

import com.example.site.ems.domain.Job;
import com.example.site.ems.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/jobs/")
public class JobControllerImpl implements JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("new")
    public String gotoAdd(Job job) {

        //employeeService.add(employee);
        return "add-job";
    }

    @GetMapping("list")
    public String listAll(Model model) {
        List<Job> jobs = jobService.findAll();
        System.out.println(jobs.toString());
        model.addAttribute("jobs", jobs);
        return "Home";
    }

    @PostMapping("add")
    public String add(Job job, BindingResult result) {
        if (result.hasErrors()) {
            return "add-job";
        }
        jobService.add(job);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String gotoUpdate(@PathVariable("id") int id, Model model) {
        Job job = jobService.findById(id);
        model.addAttribute("job", job);
        return "update";
    }

    @PostMapping("update/{id}")
    public String update(@PathVariable("id") int id,
                         Job job, BindingResult result,
                         Model model) {
        if (result.hasErrors()) {
            job.setId(id);
            return "update";
        }

        jobService.add(job);
        model.addAttribute("jobs", jobService.findAll());
        return "Home";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int id, Model model) {
        //Employee employee = employeeService.findById(id);
        jobService.delete(id);
        model.addAttribute("jobs", jobService.findAll());
        return "Home";
    }
}
