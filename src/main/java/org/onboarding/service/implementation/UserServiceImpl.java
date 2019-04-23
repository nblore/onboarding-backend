package org.onboarding.service.implementation;

import org.onboarding.entity.User;
import org.onboarding.repository.UserRepository;
import org.onboarding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User>  findByFirstName(String firstName) { return userRepository.findByFirstName(firstName); }

    @Override
    public User findByUsername(String username) { return userRepository.findByUsername(username); }

    @Override
    public List<User> findAll() { return userRepository.findAll(); }

    @Override
    public User save(User user) { return userRepository.save(user); }

    @Override
    public void delete(Long id) { userRepository.deleteById(id); }

}

