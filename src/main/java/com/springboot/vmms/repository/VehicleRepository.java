package com.springboot.vmms.repository;

import com.springboot.vmms.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    public List<Vehicle> findByUserId(String user_id);

    public Vehicle findByUserIdAndRegNo(String user_id, String regNo);
}
