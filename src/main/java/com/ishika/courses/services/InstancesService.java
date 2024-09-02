package com.ishika.courses.services;
import com.ishika.courses.entities.Instances;

import java.util.List;

public interface InstancesService {
    Instances saveInstance(Instances instances);
    List<Instances> getInstance(int year, int sem);
}
