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

    @GetMapping(path = "/{id}/{regNo}")
    public Vehicle getVehicleDetails(@PathVariable String id, @PathVariable String regNo) {
        return vehicleRepository.findByUserIdAndRegNo(id, regNo);
    }

    @GetMapping(path = "/all")
    public List<Vehicle> getVehicleList() {
        return vehicleRepository.findAll();
    }

    @PostMapping(path = "create")
    public Vehicle createVehicle(@RequestBody Vehicle vehicleDetails) {
        Vehicle vehicle = vehicleRepository.save(vehicleDetails);
        return vehicle;
    }

    @PutMapping(path = "/{id}/{regNo}/update")
    public Vehicle updateVehicle(@PathVariable String id, @PathVariable String regNo, @RequestBody Vehicle vehicleDetails) {
        Vehicle vehicle = vehicleRepository.findByUserIdAndRegNo(id, regNo);

        vehicle.setChassisNo(vehicleDetails.getChassisNo());
        vehicle.setColor(vehicleDetails.getColor());
        vehicle.setEngiNo(vehicleDetails.getEngiNo());
        vehicle.setFuelType(vehicleDetails.getFuelType());
        vehicle.setOdoRead(vehicleDetails.getOdoRead());
        vehicle.setVehiMake(vehicleDetails.getVehiMake());
        vehicle.setVehiModel(vehicleDetails.getVehiModel());
        vehicle.setYrManu(vehicleDetails.getYrManu());

        Vehicle updatedVehicle = vehicleRepository.save(vehicle);
        return updatedVehicle;
    }
}
