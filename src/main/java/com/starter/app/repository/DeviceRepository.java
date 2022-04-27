package com.starter.app.repository;

import com.starter.app.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeviceRepository extends MongoRepository<Device,String> {
}
