package com.example.demoparkingvehicle.dao.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demoparkingvehicle.dao.ParkingDao;
import com.example.demoparkingvehicle.dto.VehicleDto;
import com.example.demoparkingvehicle.model.ParkingVehicle;
import com.example.demoparkingvehicle.repositpry.ParkingRepo;

@Repository
public class ParkingDaoImpl implements ParkingDao{
	
	@Autowired
	JdbcTemplate template;
	
	@Autowired
	ParkingRepo parkRepo;

	@Override
	public String exitVehicle(String vehicleNumber) {
		// TODO Auto-generated method stub
	   String query = "update ParkingVehicle set exit_time = ? where vehicle_number = ?";
	   template.update(query, new Date(), vehicleNumber);
	   return "vehicle exit saved";
	}

	@Override
	public String saveEntryVehicleInfo(VehicleDto vehicleDto) {
		// TODO Auto-generated method stub
		ParkingVehicle vehicle = new ParkingVehicle();
		vehicle.setParking_slot(vehicleDto.getParking_slot());
		vehicle.setVehicle_number(vehicleDto.getVehicle_number());
		vehicle.setEntry_time(new Date());
		vehicle.setExit_time(null);
		parkRepo.save(vehicle);
		return "vehicle info saved";
	}

	
}
