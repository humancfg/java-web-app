package com.happypath.core.db;

import com.happypath.core.model.User;
import com.happypath.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.ignoreCase;

public class InitUsers {
    @Autowired
    private UserRepository userRepository;

    public void addUsers() {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setEmail(String.format("asd%s@mail.ru", i));
            user.setPassword(String.format("password%s", i));
            ExampleMatcher emailMatcher = ExampleMatcher.matching()
                    .withIgnorePaths("id")
                    .withMatcher("email", ignoreCase());
            if(!userRepository.exists(Example.of(user, emailMatcher))) {
                users.add(user);
            }
        }

        userRepository.saveAll(users);
    }
}
