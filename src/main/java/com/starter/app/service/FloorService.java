package com.starter.app.service;

import com.starter.app.model.Floor;
import com.starter.app.repository.FloorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class FloorService {


    private FloorRepository floorRepository;

    public List<Floor> findAll() {
        return floorRepository.findAll();
    }

    public Floor addFloor(Floor floor) {
        return floorRepository.save(floor);
    }



    public void deleteFloor(String id) {

    }

}
