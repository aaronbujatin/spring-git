package com.aaronbujatin.springgit.services;

import com.aaronbujatin.springgit.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.aaronbujatin.springgit.model.User;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    public User saveUser(User user){
        return userRepository.save(user);
    }



}
