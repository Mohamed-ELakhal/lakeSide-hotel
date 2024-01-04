package com.mhdMagdy.demo.repository;

import com.mhdMagdy.demo.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedRoomRepository extends JpaRepository<BookedRoom,Long>{
    List<BookedRoom> findByRoomId(Long roomId);
}
