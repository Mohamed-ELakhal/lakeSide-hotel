package com.mhdMagdy.demo.service;

import com.mhdMagdy.demo.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
