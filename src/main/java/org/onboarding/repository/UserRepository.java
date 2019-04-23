package org.onboarding.repository;

import org.onboarding.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    List<User>  findByFirstName(String firstName);
    User findByUsername(String username);
    User save(User user);
    void deleteById(Long id);
}
