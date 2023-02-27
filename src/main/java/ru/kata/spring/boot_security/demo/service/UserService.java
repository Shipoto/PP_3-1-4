package ru.kata.spring.boot_security.demo.service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.util.Collections;
import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> listUsers();
    void add(User user);
    User getOneUser(int id);
    void delete(int id);
    void update(User user);


    UserDetails loadUserByUsername(String username);

    public boolean saveUser(User user);
}
