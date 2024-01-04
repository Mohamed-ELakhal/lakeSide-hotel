package com.mhdMagdy.demo.response;

import com.mhdMagdy.demo.model.BookedRoom;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;
@Data
@NoArgsConstructor
public class RoomResponse {
    private  Long id;
    private  String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked=false;
    private List<BookingResponse> bookings;
    private String photo;

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice,
                        boolean isBooked, byte[] photoBytes ,List<BookingResponse> bookings
                        ) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.bookings = bookings;
        this.photo = photoBytes !=null ? Base64.encodeBase64String(photoBytes) :null;
    }
}
