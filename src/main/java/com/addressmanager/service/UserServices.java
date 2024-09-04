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

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    public User updatUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
