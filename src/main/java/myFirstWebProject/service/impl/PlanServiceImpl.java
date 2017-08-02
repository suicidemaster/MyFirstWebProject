package myFirstWebProject.service.impl;

import myFirstWebProject.entities.Plan;
import myFirstWebProject.repository.PlanRepository;
import myFirstWebProject.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */

@Service("jpaPlanService")
@Repository
@Transactional
public class PlanServiceImpl implements GenericService<Plan> {

    @Autowired
    PlanRepository planRepository;

    public void save(Plan plan) {
        planRepository.save(plan);
    }

    public void delete(Plan plan) {
        planRepository.delete(plan);

    }

    public Plan findById(long id) {
        return null;
    }

    public List<Plan> findAll() {
        return null;
    }
}
