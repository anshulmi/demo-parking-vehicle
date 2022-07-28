package com.example.demoparkingvehicle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoparkingvehicle.dao.ParkingDao;
import com.example.demoparkingvehicle.dto.VehicleDto;
import com.example.demoparkingvehicle.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService{

	@Autowired
	ParkingDao parkDao;

	@Override
	public String exitVehicle(String vehicleNumber) {
		// TODO Auto-generated method stub
		return parkDao.exitVehicle(vehicleNumber);
	}

	@Override
	public String saveEntryVehicleInfo(VehicleDto vehicleDto) {
		// TODO Auto-generated method stub
		return parkDao.saveEntryVehicleInfo(vehicleDto);
	}
}
