package net.payla.webapp.core.users.interfaces;

import net.payla.webapp.core.users.User;

public interface Users {
    public void addUser(User user) throws Exception;

    public void deleteUser(User user) throws Exception;

    public void editUser(User user) throws Exception;

    public void lookupUser(User user) throws Exception;
}
