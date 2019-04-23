package org.onboarding.service;

import org.onboarding.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    List<User>  findByFirstName(String firstName);
    User findByUsername(String username);
    User save(User user);
    void delete(Long id);
    
}

