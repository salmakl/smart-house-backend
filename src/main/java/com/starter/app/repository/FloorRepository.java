package com.starter.app.repository;

import com.starter.app.model.Floor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends MongoRepository<Floor, String> {

}
