package myFirstWebProject.service.impl;

import com.google.common.collect.Lists;
import myFirstWebProject.entities.Client;
import myFirstWebProject.entities.Contract;
import myFirstWebProject.repository.ClientRepository;
import myFirstWebProject.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */

@Service("jpaClientService")
@Repository
@Transactional
public class ClientServiceImpl implements GenericService<Client> {

    @Autowired
    ClientRepository clientRepository;

    @Transactional
    public void save(Client client) {
        clientRepository.save(client);
    }

    public void delete(Client client) {
        clientRepository.delete(client);

    }

    public Client findById(long id) {
        return clientRepository.findById(id);
    }


    public List<Client> findAll() {
        return Lists.newArrayList(clientRepository.findAll());
    }
}
