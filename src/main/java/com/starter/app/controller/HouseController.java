package com.starter.app.controller;

import com.starter.app.model.House;
import com.starter.app.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("/house")
    public List<House> getHouse(){
        return houseService.findAll();
    }

    @PostMapping("/house")
    public House addHouse(@RequestBody House house){
        System.out.println("house data " + house);
        return houseService.addHouse(house);
    }

    @PutMapping("/house/{id}")
    public House updateHouse(@PathVariable String id, @RequestBody House house) {
        return houseService.updateHouse(id,house);
    }

    @DeleteMapping("/house/{id}")
    public void deleteHouse(@PathVariable String id){
        houseService.deleteHouse(id);
    }
}
