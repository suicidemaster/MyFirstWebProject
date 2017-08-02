package myFirstWebProject.repository;

import myFirstWebProject.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLogin(String login);
    List<User> findByLoginAndPassword(String firstName, String lastName);
}

