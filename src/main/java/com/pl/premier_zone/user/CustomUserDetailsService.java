package com.pl.premier_zone.user;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Remplace cette partie par ton accès à la BDD
        if (!username.equals("admin")) {
            throw new UsernameNotFoundException("User not found");
        }
        return User.withUsername(username)
                .password("{noop}password") // {noop} = pas d'encodage
                .roles("USER")
                .build();
    }
}
