package com.example.azureappserviceapp1.repository;

import com.example.azureappserviceapp1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositroy extends JpaRepository<User, Integer> {
    User findByName(String name);
}
