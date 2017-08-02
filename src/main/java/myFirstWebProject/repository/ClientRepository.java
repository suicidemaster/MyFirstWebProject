package myFirstWebProject.repository;

import myFirstWebProject.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findById(long id);
}
