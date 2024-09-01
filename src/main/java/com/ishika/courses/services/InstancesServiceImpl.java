package com.ishika.courses.services;
import com.ishika.courses.entities.Instances;
import com.ishika.courses.repositories.InstancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstancesServiceImpl implements InstancesService {
    @Autowired
    private InstancesRepository instancesRepository;

    @Override
    public Instances saveInstance(Instances instances) {
        return this.instancesRepository.save(instances);
    }
}
