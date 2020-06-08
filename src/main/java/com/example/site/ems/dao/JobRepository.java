package com.example.site.ems.dao;

import com.example.site.ems.domain.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer> {
}
