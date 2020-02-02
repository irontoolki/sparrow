package net.payla.webapp.iam;

import net.payla.webapp.core.users.User;

import java.util.UUID;

public class UserIDManager {
    synchronized long getUserId(UserType userType){
        //todo query database and return unique ID according userType

        /**
         *     ADMIN,          0 .. 1_000
         *     MANUFACTURE,    1_001 .. 1_000_000
         *     SUPPLIER,       1_000_001 .. 10_000_000
         *     RETAILER;       10_000_001 .. 100_000_000
         */

        return 100;//
    }
}
