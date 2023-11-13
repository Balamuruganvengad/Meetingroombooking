package com.mrm.crud.meeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mrm.crud.meeting.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{


}
