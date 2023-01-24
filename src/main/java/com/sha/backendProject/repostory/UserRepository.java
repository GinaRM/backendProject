package com.sha.backendProject.repostory;

import com.sha.backendProject.model.Role;
import com.sha.backendProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByIdentification(String identification);


    @Modifying
    @Query("update User set role = :role where identification= :identification")
    void updateUserRole(@Param("identification") String identification, @Param("role") Role role);


}
