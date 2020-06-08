package com.example.site.ems.service;

import com.example.site.ems.domain.Job;

import java.util.List;

public interface JobService {
    Job findById(int id);

    List<Job> findAll();

    void add(Job job);

    boolean delete(int id);
}
