package com.sha.backendProject.service;

import com.sha.backendProject.model.User;

import java.util.Optional;

public interface UserService {


    User saveUser(User user);

    Optional<User> findByIdentification(String identification);


}


