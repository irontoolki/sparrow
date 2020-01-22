package net.payla.webapp.api.security;

import org.springframework.web.bind.annotation.RequestParam;

public interface Authentication {

    /**
     * Register new user
     * Remove registered user
     * Login
     * Logout
     * Check Privilege
     */


    int regNewUser(Long id,
                   String password,
                   String email) throws Exception;

}
