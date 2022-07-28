package com.example.demoparkingvehicle.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoparkingvehicle.model.ParkingVehicle;

public interface ParkingRepo extends JpaRepository<ParkingVehicle, Integer>{

}
