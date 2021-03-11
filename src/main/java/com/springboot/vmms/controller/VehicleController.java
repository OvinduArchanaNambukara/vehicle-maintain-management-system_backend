package com.springboot.vmms.controller;

import com.springboot.vmms.model.Vehicle;
import com.springboot.vmms.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping(path = "/{id}")
    public List<Vehicle> getVehicleById(@PathVariable String id) {
        return vehicleRepository.findByUserId(id);
    }
    @GetMapping(path = "/all")
    public List<Vehicle> getVehicleList(){
        return vehicleRepository.findAll();
    }

    @PostMapping(path = "create")
    public Vehicle createVehicle(@RequestBody Vehicle vehicleDetails){
        Vehicle vehicle=vehicleRepository.save(vehicleDetails);
        return vehicle;
    }

}
