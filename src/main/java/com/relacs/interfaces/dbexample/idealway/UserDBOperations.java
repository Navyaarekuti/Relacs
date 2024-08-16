package com.relacs.interfaces.dbexample.idealway;

import com.relacs.interfaces.User;

public interface UserDBOperations
{
    User insert(User u);

    User update(int id, User updatedUser);
}
