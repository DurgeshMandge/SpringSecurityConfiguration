package com.durgesh.SpringSecurityTelusco.service;

import com.durgesh.SpringSecurityTelusco.model.UserPrincipal;
import com.durgesh.SpringSecurityTelusco.model.Users;
import com.durgesh.SpringSecurityTelusco.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        return new UserPrincipal(user);
    }
}
