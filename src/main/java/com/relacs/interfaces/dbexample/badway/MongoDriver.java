package com.relacs.interfaces.dbexample.badway;

import com.relacs.interfaces.User;

public class MongoDriver {
    public User insertOne(String collectionName, User u){
        System.out.println("Inserting user in mongo");
        return u;
    }

    public User update(int id, User updated, boolean upsert){
        System.out.println("Upserting user with id:" + id);
        return updated;
    }
}
