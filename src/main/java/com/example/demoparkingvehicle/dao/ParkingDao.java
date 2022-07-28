package com.example.demoparkingvehicle.dao;

import com.example.demoparkingvehicle.dto.VehicleDto;

public interface ParkingDao {

	String exitVehicle(String vehicleNumber);

	String saveEntryVehicleInfo(VehicleDto vehicleDto);

}
