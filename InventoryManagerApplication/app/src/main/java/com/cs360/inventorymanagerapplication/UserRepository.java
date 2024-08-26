package com.cs360.inventorymanagerapplication;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class UserRepository {
    private UserDao mUserDao;
    private LiveData<List<User>> mAllUsers;

    UserRepository(Application application) {
        UserDatabase db = UserDatabase.getDatabase(application);
        mUserDao = db.userDao();
        mAllUsers = mUserDao.getAllUsers();
    }

    LiveData<List<User>> getAllUsers() {
        return mAllUsers;
    }

    LiveData<User> getUserById(int id) {
        return mUserDao.getUserById(id);
    }

    LiveData<User> getUserByUsername(String username) {
        return mUserDao.getUserByUsername(username);
    }

    void insert(User user) {
        UserDatabase.databaseWriteExecutor.execute(() -> {
            mUserDao.insert(user);
        });
    }

    void update(User user) {
        UserDatabase.databaseWriteExecutor.execute(() -> {
            mUserDao.update(user);
        });
    }

    void delete(User user) {
        UserDatabase.databaseWriteExecutor.execute(() -> {
            mUserDao.delete(user);
        });
    }
}
