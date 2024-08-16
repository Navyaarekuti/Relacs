package com.relacs.interfaces.dbexample.idealway;

import com.relacs.interfaces.User;


public class UserService {
    UserDBOperations db = new MYSQLUserDBOperations();
    //UserDBOperations db = new MongoUserDBOperations();

    public User createUser(User u)
    {
        return db.insert(u);
    }
    public User updateUser(User u){
        return db.update(u.id, u);
    }
}
