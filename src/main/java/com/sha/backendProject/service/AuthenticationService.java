package com.sha.backendProject.service;

import com.sha.backendProject.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
