package com.relacs.interfaces.dbexample.badway;

import com.relacs.interfaces.User;

public class UserService {
    MySQLDriver db = new MySQLDriver();
    public User createUser(User u)
    {
        //return db.insert(u);
        return null;
    }
    public User updateUser(User u){
      // return db.update(u.id, u);
        return  null;
    }
}
