package com.example.site.ems.dao;

import com.example.site.ems.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class JobDaoImpl implements JobDao {
    @Autowired
    private JobRepository repository;
    //TODO: Must implement:

    @Override
    public Job findById(int id) {
        System.out.println("## JobDaoDatabaseImpl findJob()");

        Optional<Job> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    //TODO: Must implement:

    @Override
    public List<Job> findAll() {
        System.out.println("## JobDaoDatabaseImpl findJob()");
        Iterable<Job> result = repository.findAll();
        List<Job> jobs = new ArrayList<>();
        for (Job job : result) {
            jobs.add(job);
        }
        return jobs;
    }

    @Override
    public void add(Job job) {
        System.out.println("* JobDatabaseImpl.add()");
        repository.save(job);
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Job is deleted");
        repository.deleteById(id);
        return true;
    }

}


