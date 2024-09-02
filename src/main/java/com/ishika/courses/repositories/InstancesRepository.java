package com.ishika.courses.repositories;

import com.ishika.courses.entities.Instances;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstancesRepository extends JpaRepository<Instances, Long> {
    List<Instances> findByYearAndSem(int year, int sem);
}
