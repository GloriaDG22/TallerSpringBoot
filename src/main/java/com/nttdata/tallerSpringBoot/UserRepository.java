package com.nttdata.tallerSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(int id);

    List<User> findAll();
    //List<User> findByBirthDate(String BirthDate);
}
