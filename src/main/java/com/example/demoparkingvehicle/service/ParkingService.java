package com.example.demoparkingvehicle.service;

import com.example.demoparkingvehicle.dto.VehicleDto;

public interface ParkingService {

	String exitVehicle(String string);

	String saveEntryVehicleInfo(VehicleDto vehicleDto);

}
