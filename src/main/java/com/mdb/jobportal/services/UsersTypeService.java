package com.mdb.jobportal.services;

import com.mdb.jobportal.entity.UserType;
import com.mdb.jobportal.repository.UsersTypeRepository;
import org.apache.catalina.User;
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

    public List<UserType> getAll(){
        return usersTypeRepository.findAll();
    }
}
