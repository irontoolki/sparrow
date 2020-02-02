package net.payla.webapp.iam.interfaces;

import net.payla.webapp.core.users.User;

public interface Auditing {
    public void getUserActivities(User user) throws Exception;

    public void setUserActivities(User user) throws Exception;

}
