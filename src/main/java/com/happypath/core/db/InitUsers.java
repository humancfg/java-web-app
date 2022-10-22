package com.happypath.core.db;

import com.happypath.core.model.User;
import com.happypath.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class InitUsers {
    @Autowired
    private UserRepository userRepository;

    public void addUsers() {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setEmail(String.format("asd%s@mail.ru", i));
            user.setPassword(String.format("password%s", i));
            users.add(user);
        }

        userRepository.saveAll(users);
    }
}
