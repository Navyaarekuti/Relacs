package com.relacs.interfaces.dbexample.badway;

import com.relacs.interfaces.User;

public class MySQLDriver {
    public User insert(User u){
        System.out.println("Inserting User");
        return u;
    }

    public User update(int id, User updated){
        System.out.println("Updating user with id:" + id);
        return updated;
    }
}
