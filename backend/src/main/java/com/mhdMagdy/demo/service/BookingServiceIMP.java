package com.mhdMagdy.demo.service;

import com.mhdMagdy.demo.model.BookedRoom;
import com.mhdMagdy.demo.repository.BookedRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceIMP implements IBookingService {
    private final BookedRoomRepository bookingRepository;
    private final IRoomService roomService;

    @Override
    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return bookingRepository.findByRoomId(roomId);
    }
}
