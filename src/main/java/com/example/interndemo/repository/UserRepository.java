package com.example.interndemo.repository;

import com.example.interndemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // JpaRepository already gives us:
    // save(), findById(), findAll(), deleteById(), count(), etc.

    // Custom query example (optional):
    // Find user by email
    User findByEmail(String email);

}
