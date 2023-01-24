package com.sha.backendProject.repostory;

import com.sha.backendProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByIdentification(String identification);


}
