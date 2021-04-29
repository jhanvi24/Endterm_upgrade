package com.example.backendupgrade.service;


import com.example.backendupgrade.model.UserDetails;
import com.example.backendupgrade.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    UserRepository userRepository;

    public void registerUser(UserDetails newUser){
        userRepository.register(newUser);
    }
}
