package com.example.demoparkingvehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoparkingvehicle.dto.VehicleDto;
import com.example.demoparkingvehicle.service.ParkingService;

@RestController
public class ParkingController {

	@Autowired
	ParkingService parkService;
	
	@GetMapping("/exitVehicle")
	public String exitVehicle(@RequestParam String vehicleNumber) {
		return parkService.exitVehicle(vehicleNumber);
	}
	
	@PostMapping("/saveEntryVehicleInfo")
	public String saveEntryVehicleInfo(@RequestBody VehicleDto VehicleDto) {
		return parkService.saveEntryVehicleInfo(VehicleDto);
	}
}
