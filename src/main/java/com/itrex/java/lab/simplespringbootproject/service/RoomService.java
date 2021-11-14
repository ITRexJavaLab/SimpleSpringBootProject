package com.itrex.java.lab.simplespringbootproject.service;

import com.itrex.java.lab.simplespringbootproject.entity.Room;
import com.itrex.java.lab.simplespringbootproject.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return IterableUtils.toList(roomRepository.findAll());
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }
}
