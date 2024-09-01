package com.addressmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.addressmanager.models.User;
import com.addressmanager.repository.UserRepository;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public User createUser (User user) {
        User save = userRepository.save(user);
        return save;
    }
}
