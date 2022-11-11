package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface RoleService {
    List<Role> allRoles();

    void saveRole(Role role);

    Role getRole(int id);

    void deleteRole(int id);

    Role findByRole(String role);

    Role getByName(String roleName);

    Set <Role> getRoles (String [] role);
}
