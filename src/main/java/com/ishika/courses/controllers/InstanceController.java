package com.ishika.courses.controllers;

import com.ishika.courses.entities.Instances;
import com.ishika.courses.services.InstancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class InstanceController {
    @Autowired
    private InstancesService instancesService;

    @PostMapping("api/instances")
    public Instances saveInstance(@RequestBody Instances instances) {
        return this.instancesService.saveInstance(instances);
    }

}
