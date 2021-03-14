package com.springboot.vmms.repository;

import com.springboot.vmms.model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Bookings, Long> {
    public List<Bookings> findAllByUserId(String userId);
}
