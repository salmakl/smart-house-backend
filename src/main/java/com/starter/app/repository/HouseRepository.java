package com.starter.app.repository;

import com.starter.app.model.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {
}
