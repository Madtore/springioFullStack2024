package com.cesur.general.general.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesur.general.general.models.User;
import java.util.Optional;




public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> getUserByEmail(String email);
    
}
