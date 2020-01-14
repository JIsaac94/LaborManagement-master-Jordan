package com.labormanagement.reposit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.labormanagement.java.entity.JobWorkload;

@Repository
public interface JobWorkloadRepository extends CrudRepository<JobWorkload, Long>{

}