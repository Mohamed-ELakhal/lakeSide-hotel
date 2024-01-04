package com.mhdMagdy.demo.model;

import ch.qos.logback.core.testUtil.RandomUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name="room_type")
    private  String roomType;
    @Column(name="room_price")
    private BigDecimal roomPrice;
    @Column(name="is_booked")
    private boolean isBooked=false;
    @OneToMany(mappedBy = "room",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<BookedRoom> bookings;
    @Lob
    private Blob photo;

    public void addBooking(BookedRoom bookedRoom){
        if(bookings==null)
            bookings=new ArrayList<>();
        bookings.add(bookedRoom);
        bookedRoom.setRoom(this);
        isBooked=true;
        String bookingCode= RandomStringUtils.randomNumeric(10);
        bookedRoom.setBookingConfirmationCode(bookingCode);
    }

    public Room() {
        this.bookings = new ArrayList<>();
    }
}
