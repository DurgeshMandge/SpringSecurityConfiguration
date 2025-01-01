package com.durgesh.SpringSecurityTelusco.service;

import com.durgesh.SpringSecurityTelusco.model.Users;
import com.durgesh.SpringSecurityTelusco.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users doRegister(Users user){
        return userRepo.save(user);
    }
}
