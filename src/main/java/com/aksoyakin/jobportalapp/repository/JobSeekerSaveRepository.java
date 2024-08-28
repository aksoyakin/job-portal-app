package com.aksoyakin.jobportalapp.repository;

import com.aksoyakin.jobportalapp.entity.JobPostActivity;
import com.aksoyakin.jobportalapp.entity.JobSeekerProfile;
import com.aksoyakin.jobportalapp.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);
    List<JobSeekerSave> findByJob(JobPostActivity job);
}
