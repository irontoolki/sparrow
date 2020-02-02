package net.payla.webapp.iam.interfaces;

import net.payla.webapp.core.users.User;

public interface AAA {
    // Authentication, Authorization, Accounting

    public boolean isAuthenticated(User userInfo) throws Exception;



}
