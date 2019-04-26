package org.onboarding.repository;

import org.onboarding.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*** 
Allows database interaction using spring data
***/
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
    User save(User user);
    void deleteById(Long id);
}
