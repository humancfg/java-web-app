package com.happypath.core.service;

import com.happypath.core.model.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);

    List<User> getUsers();
}
