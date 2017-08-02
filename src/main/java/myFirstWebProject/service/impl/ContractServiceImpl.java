package myFirstWebProject.service.impl;

import com.google.common.collect.Lists;
import myFirstWebProject.entities.Contract;
import myFirstWebProject.repository.ContractRepository;
import myFirstWebProject.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */
@Service("jpaContractService")
@Repository
@Transactional
public class ContractServiceImpl implements GenericService<Contract> {

    @Autowired
    ContractRepository contractRepository;

    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    public void delete(Contract contract) {
        contractRepository.delete(contract);

    }

    public Contract findById(long id) {
        return contractRepository.findById(id);
    }

    public List<Contract> findAll() {
        return Lists.newArrayList(contractRepository.findAll());
    }
}
