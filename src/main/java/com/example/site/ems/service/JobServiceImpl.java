package com.example.site.ems.service;

import com.example.site.ems.dao.JobDao;
import com.example.site.ems.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao dao;

    @Override
    public Job findById(int id) {

        return dao.findById(id);
    }

    @Override
    public List<Job> findAll() {
        return dao.findAll();
    }

    @Override
    public void add(Job job) {

        dao.add(job);
    }

    @Override
    public boolean delete(int id) {
        dao.delete(id);
        return true;
    }
}
