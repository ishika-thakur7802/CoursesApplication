package com.ishika.courses.controllers;

import com.ishika.courses.entities.Instances;
import com.ishika.courses.services.InstancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class InstanceController {
    @Autowired
    private InstancesService instancesService;

    @PostMapping("api/instances")
    public Instances saveInstance(@RequestBody Instances instances) {
        return this.instancesService.saveInstance(instances);
    }

    @GetMapping("api/instances")
    public List<Instances> getAllInstances()
    {
        return this.instancesService.getAllInstances();
    }

    @GetMapping("api/instances/{year}/{sem}")
    public List<Instances> getInstance(@PathVariable int year, @PathVariable int sem) {
        List<Instances> inst=this.instancesService.getInstance(year,sem);
        if(!inst.isEmpty())
            return inst;
        throw new RuntimeException("Instance not found");
    }

    @GetMapping("api/instances/{year}/{sem}/{id}")
    public List<Instances> getInstances(@PathVariable int year, @PathVariable int sem, @PathVariable long id)
    {
        List<Instances> inst2= this.instancesService.getInstances(year,sem,id);
        if(!inst2.isEmpty())
            return inst2;
        throw new RuntimeException("Instance not found");
    }

    @DeleteMapping("api/instances/{year}/{sem}/{id}")
    public void deleteInstance(@PathVariable int year, @PathVariable int sem, @PathVariable long id) {
        this.instancesService.deleteInstance(year,sem,id);
    }


}
