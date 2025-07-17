package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.entity.User;
import java.util.Optional;

public interface userrepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
