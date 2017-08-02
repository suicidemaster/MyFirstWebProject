package myFirstWebProject.repository;

import myFirstWebProject.entities.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, Long> {
    Contract findById(long id);
}
