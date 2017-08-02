package myFirstWebProject.service.impl;

import myFirstWebProject.entities.Option;
import myFirstWebProject.repository.OptionRepository;
import myFirstWebProject.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */
@Service("jpaOptionService")
@Repository
@Transactional
public class OptionServiceImpl implements GenericService<Option> {

    @Autowired
    OptionRepository optionRepository;

    public void save(Option option) {
        optionRepository.save(option);
    }

    public void delete(Option option) {
        optionRepository.delete(option);

    }

    public Option findById(long id) {
        return optionRepository.findById(id);
    }

    public List<Option> findAll() {
        return null;
    }
}
