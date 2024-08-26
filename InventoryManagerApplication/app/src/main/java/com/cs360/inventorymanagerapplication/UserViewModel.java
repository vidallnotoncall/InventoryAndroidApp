package com.cs360.inventorymanagerapplication;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
    private UserRepository mRepository;
    private LiveData<List<User>> mAllUsers;

    public UserViewModel(Application application) {
        super(application);
        mRepository = new UserRepository(application);
        mAllUsers = mRepository.getAllUsers();
    }

    LiveData<List<User>> getAllUsers() {
        return mAllUsers;
    }

    LiveData<User> getUserById(int id) {
        return mRepository.getUserById(id);
    }

    LiveData<User> getUserByUsername(String username) {
        return mRepository.getUserByUsername(username);
    }

    public void insert(User user) {
        mRepository.insert(user);
    }

    public void update(User user) {
        mRepository.update(user);
    }

    public void delete(User user) {
        mRepository.delete(user);
    }
}