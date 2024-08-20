package com.aksoyakin.jobportalapp.services;

import com.aksoyakin.jobportalapp.entity.UsersType;
import com.aksoyakin.jobportalapp.repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAllUsersTypes() {
        return usersTypeRepository.findAll();
    }
}
