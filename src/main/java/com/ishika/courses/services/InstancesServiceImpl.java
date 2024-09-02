package com.ishika.courses.services;
import com.ishika.courses.entities.Courses;
import com.ishika.courses.entities.Instances;
import com.ishika.courses.repositories.InstancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstancesServiceImpl implements InstancesService {
    @Autowired
    private InstancesRepository instancesRepository;

    @Override
    public Instances saveInstance(Instances instances) {
        return this.instancesRepository.save(instances);
    }

    @Override
    public List<Instances> getInstance(int year, int sem) {
        return this.instancesRepository.findByYearAndSem(year, sem);
    }



}

