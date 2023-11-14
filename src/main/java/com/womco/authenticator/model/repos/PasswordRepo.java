package com.womco.authenticator.model.repos;

import com.womco.authenticator.model.Password;
import com.womco.authenticator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PasswordRepo extends JpaRepository<Password,Long> {
    Optional<Password> findTopByUserId(User user);
}
