package com.example.site.ems.controller;

import com.example.site.ems.domain.Job;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public interface JobController {

    String gotoAdd(Job job);

    String listAll(Model model);

    String add(Job job, BindingResult result);

    String gotoUpdate(int id, Model model);

    String update(int id,
                  Job job, BindingResult result,
                  Model model);

    public String delete(int id, Model model);
}
