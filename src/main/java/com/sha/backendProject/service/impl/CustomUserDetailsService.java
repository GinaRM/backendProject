package com.sha.backendProject.service.impl;

import com.sha.backendProject.model.User;
import com.sha.backendProject.security.UserPrinciple;
import com.sha.backendProject.service.UserService;
import com.sha.backendProject.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByIdentification(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));
        Set<GrantedAuthority> authorities =Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));



        return UserPrinciple.builder()
                .user(user)
                .id(user.getId())
                .username(user.getIdentification())
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
}
