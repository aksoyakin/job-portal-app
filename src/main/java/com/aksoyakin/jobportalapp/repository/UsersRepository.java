package com.aksoyakin.jobportalapp.repository;

import com.aksoyakin.jobportalapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
