package com.celia.auth.repository;

import com.celia.auth.model.Role;
import com.celia.auth.model.RoleName;
import com.celia.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
}

