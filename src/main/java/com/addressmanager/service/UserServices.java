package com.addressmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.addressmanager.models.User;
import com.addressmanager.repository.UserRepository;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User user) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User userToUpdate = userOptional.get();
            userToUpdate.setNome(user.getNome());
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setSenha(user.getSenha());
            return userRepository.save(userToUpdate);
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }
}