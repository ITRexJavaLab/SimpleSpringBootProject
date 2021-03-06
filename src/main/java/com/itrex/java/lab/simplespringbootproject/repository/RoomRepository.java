package com.itrex.java.lab.simplespringbootproject.repository;

import com.itrex.java.lab.simplespringbootproject.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
