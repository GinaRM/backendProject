package com.sha.backendProject.service;

import com.sha.backendProject.model.Role;
import com.sha.backendProject.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByIdentification(String identification);


    @Transactional
        //require when executing an update or delete query
    void changeRole(Role newRole, String username);

    User getUserById(Long id);

    List<User> getAllUsers();
}


