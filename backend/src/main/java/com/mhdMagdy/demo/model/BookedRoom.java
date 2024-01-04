package com.mhdMagdy.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @Column(name="check_in")
    private LocalDate checkInDate;
    @Column(name="check_out")
    private LocalDate checkOutDate;
    @Column(name="guest_FullName")
    private String guestFullName;
    @Column(name="guest_Email")
    private String guestEmail;
    @Column(name="childern")
    private int NumOfChildern;
    @Column(name="adults")
    private int NumOfAdults;
    @Column(name="total_guest")
    private int totalNumOfGuest;
    @Column(name = "confirmation_Code")
    private String bookingConfirmationCode;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;


    public void calculateTotalNumofGuest(){
        this.totalNumOfGuest=this.NumOfAdults+this.NumOfAdults;
    }

    public void setNumOfChildern(int numOfChildern) {
        NumOfChildern = numOfChildern;
        calculateTotalNumofGuest();
    }

    public void setNumOfAdults(int numOfAdults) {
        NumOfAdults = numOfAdults;
        calculateTotalNumofGuest();
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
