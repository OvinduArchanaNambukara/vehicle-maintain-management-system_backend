package com.springboot.vmms.controller;


import com.springboot.vmms.model.Vehicle;
import com.springboot.vmms.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping(path = "/{id}")
    public Vehicle getVehicleById(@PathVariable String id) {
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow();
        return vehicle;
    }

    @PostMapping(path = "create")
    public Vehicle createVehicle(@RequestBody Vehicle vehicleDetails){
        Vehicle vehicle=vehicleRepository.save(vehicleDetails);
        return vehicle;
    }

}
