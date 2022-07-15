package com.example.azureappserviceapp1.service;

import com.example.azureappserviceapp1.entity.User;
import com.example.azureappserviceapp1.repository.UserRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositroy userRepository;

    @Transactional
    public List<User> getEntities() {
        return userRepository.findAll();
    }

    @Transactional
    public User getEntityByName(String name) {
        return userRepository.findByName(name);
    }

    @Transactional
    public User saveEntity(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public Optional<User> getEntity(int theId) {
        return userRepository.findById(theId);
        //return userRepository.getById(theId);
    }

    @Transactional
    public void deleteEntity(int theId) {

        userRepository.deleteById(theId);
    }
}
