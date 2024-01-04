package com.mhdMagdy.demo.response;

import com.mhdMagdy.demo.model.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private Long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int NumOfChildern;
    private int NumOfAdults;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;
    private Room room;

    public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkoutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkoutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
