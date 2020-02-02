package net.payla.webapp.iam;

import net.payla.webapp.core.users.UserInfo;

public interface AAA {
    // Authentication, Authorization, Accounting

    public boolean isAuthenticated(UserInfo userInfo) throws Exception;



}
