package myFirstWebProject.service;

import myFirstWebProject.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    List<User> findByLogin(String login);
    List<User> findByLoginAndPassword(String login, String password);

    void save(User user);
}
