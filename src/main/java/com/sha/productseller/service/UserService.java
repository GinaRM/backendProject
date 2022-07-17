package com.sha.productseller.service;

import com.sha.productseller.model.Role;
import com.sha.productseller.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //require when executing an update or delete query
    void changeRole(Role newRole, String username);
}
