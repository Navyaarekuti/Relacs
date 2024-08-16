package com.relacs.interfaces.dbexample.idealway;

import com.relacs.interfaces.User;
import com.relacs.interfaces.dbexample.badway.MySQLDriver;

public class MYSQLUserDBOperations implements UserDBOperations {

    MySQLDriver driver = new MySQLDriver();

    @Override
    public User insert(User u) {
        return driver.insert(u);
    }

    @Override
    public User update(int id, User updatedUser) {
        return driver.update(id, updatedUser);
    }
}

