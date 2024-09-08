package com.ishika.courses.services;
import com.ishika.courses.entities.Instances;

import java.util.List;

public interface InstancesService {
    Instances saveInstance(Instances instances);
    List<Instances> getInstance(int year, int sem);
    List<Instances> getInstances(int year, int sem, long id);
    void deleteInstance(int year, int sem, long id);
    List<Instances> getAllInstances();
}
