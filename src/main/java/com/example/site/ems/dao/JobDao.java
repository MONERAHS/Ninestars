package com.example.site.ems.dao;

import com.example.site.ems.domain.Job;

import java.util.List;

public interface JobDao {
    Job findById(int id);

    List<Job> findAll();

    void add(Job job);

    boolean delete(int id);
}
