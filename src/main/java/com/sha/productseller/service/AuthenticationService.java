package com.sha.productseller.service;

import com.sha.productseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
