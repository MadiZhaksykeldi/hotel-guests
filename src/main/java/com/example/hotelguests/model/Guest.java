package com.example.hotelguests.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guest {
    @Id
    private long Id;
    private long guestId;
    private String guestName;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
