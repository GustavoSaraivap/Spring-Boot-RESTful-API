package com.springcourse.repositories;

import com.springcourse.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT FROM User WHERE email = ?1 AND password = ?2", nativeQuery = true)
    Optional<User> login(String email, String password);
}
