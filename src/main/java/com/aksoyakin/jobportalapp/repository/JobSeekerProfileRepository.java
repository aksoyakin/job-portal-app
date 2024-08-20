package com.aksoyakin.jobportalapp.repository;

import com.aksoyakin.jobportalapp.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}
