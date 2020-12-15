package com.example.hotelguests.dao;

import com.example.hotelguests.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepo extends JpaRepository<Guest, Long> {
}
