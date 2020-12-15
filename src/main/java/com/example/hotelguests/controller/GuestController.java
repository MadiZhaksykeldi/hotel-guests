package com.example.hotelguests.controller;

import com.example.hotelguests.model.Guest;
import com.example.hotelguests.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GuestController {
    @Autowired
    GuestService service;

    @GetMapping(path = "/guests")
    public List<Guest> getAllGuest(){
        return service.getAllGuest();
    }

    @GetMapping(path = "/guests/{id}")
    public Optional<Guest> getGuestById(@PathVariable("id") long id){
        return service.getGuestById(id);
    }
}
