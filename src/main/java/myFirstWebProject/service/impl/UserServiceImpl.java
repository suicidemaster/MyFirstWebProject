package myFirstWebProject.service.impl;

import com.google.common.collect.Lists;
import myFirstWebProject.entities.User;
import myFirstWebProject.repository.UserRepository;
import myFirstWebProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("jpaUserService")
@Repository
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return  Lists.newArrayList(userRepository.findAll());
    }

    public List<User> findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public List<User> findByLoginAndPassword(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }


    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
}
