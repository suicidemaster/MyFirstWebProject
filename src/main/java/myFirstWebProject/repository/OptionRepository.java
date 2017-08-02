package myFirstWebProject.repository;


import myFirstWebProject.entities.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
    Option findById(long id);
}
