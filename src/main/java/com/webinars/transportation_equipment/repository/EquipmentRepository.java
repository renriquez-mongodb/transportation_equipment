package com.webinars.transportation_equipment.repository;

import com.webinars.transportation_equipment.pojo.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, String> {
}
