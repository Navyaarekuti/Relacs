package com.relacs.interfaces.dbexample.idealway;

import com.relacs.interfaces.User;
import com.relacs.interfaces.dbexample.badway.MongoDriver;

public class MongoUserDBOperations implements UserDBOperations {
    MongoDriver mongoDriver = new MongoDriver();

    @Override
    public User insert(User u) {
        return mongoDriver.insertOne("user", u);
    }

    @Override
    public User update(int id, User updatedUser) {
        return mongoDriver.update(id, updatedUser, false);

        }
    }
