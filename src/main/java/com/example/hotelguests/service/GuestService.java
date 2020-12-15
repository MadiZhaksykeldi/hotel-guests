package com.example.hotelguests.service;

import com.example.hotelguests.dao.GuestRepo;
import com.example.hotelguests.model.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GuestService {
    @Autowired
    GuestRepo Guest;

    public List<Guest> getAllGuest(){
        return Guest.findAll();
    }

    public Optional<Guest> getGuestById(long id){
        return Guest.findById(id);
    }
}
