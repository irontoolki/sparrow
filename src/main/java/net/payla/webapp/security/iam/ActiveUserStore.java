package net.payla.webapp.security.iam;

import java.util.ArrayList;
import java.util.List;

public class ActiveUserStore {

    private static ActiveUserStore single_instance = null;
    public List<String> users;


    // static method to create instance of Singleton class
    public static ActiveUserStore getInstance()
    {
        if (single_instance == null)
            single_instance = new ActiveUserStore();
        return single_instance;
    }

    public ActiveUserStore() {
        users = new ArrayList<String>();
    }

    public Boolean getUserbyID(String userID) throws Exception {
        if (users.contains(userID)) {
            return true;
        } else {
            return false;
        }
    }

    public void registerUserByID (String userID) {
        users.add(userID);
    }

    public void removeUserByID (String userID) {
        users.remove(userID);
    }


    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

}
