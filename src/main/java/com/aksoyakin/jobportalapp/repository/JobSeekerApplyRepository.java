package com.aksoyakin.jobportalapp.repository;

import com.aksoyakin.jobportalapp.entity.JobPostActivity;
import com.aksoyakin.jobportalapp.entity.JobSeekerApply;
import com.aksoyakin.jobportalapp.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);
    List<JobSeekerApply> findByJob(JobPostActivity job);
}
