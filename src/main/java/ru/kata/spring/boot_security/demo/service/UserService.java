package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    List<User> allUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    Optional<User> findByUsername(String username);
}
