package com.ishika.courses.repositories;

import com.ishika.courses.entities.Instances;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstancesRepository extends JpaRepository<Instances, Long> {
}
