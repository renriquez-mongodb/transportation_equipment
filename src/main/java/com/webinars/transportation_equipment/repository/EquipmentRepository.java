package com.webinars.transportation_equipment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webinars.transportation_equipment.pojo.Equipment;

public interface EquipmentRepository extends MongoRepository<Equipment, String> {
}
