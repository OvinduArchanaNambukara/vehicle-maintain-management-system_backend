package com.springboot.vmms.controller;

import com.springboot.vmms.model.Bookings;
import com.springboot.vmms.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping(path = "/{id}")
    public List<Bookings> getALLBookings(@PathVariable String id) {
        return bookingRepository.findAllByUserId(id);
    }

    @PostMapping(path = "/create")
    public Bookings saveBookings(@RequestBody Bookings bookingDetails) {
        Bookings bookings = bookingRepository.save(bookingDetails);
        return bookings;
    }
}
