package com.example.demoparkingvehicle.dto;

import java.util.Date;

public class VehicleDto {

	private long id;  
	private String vehicle_number;
//	private Date entry_time;
//	private Date exit_time;
	private int parking_slot;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
//	public Date getEntry_time() {
//		return entry_time;
//	}
//	public void setEntry_time(Date entry_time) {
//		this.entry_time = entry_time;
//	}
//	public Date getExit_time() {
//		return exit_time;
//	}
//	public void setExit_time(Date exit_time) {
//		this.exit_time = exit_time;
//	}
	public int getParking_slot() {
		return parking_slot;
	}
	public void setParking_slot(int parking_slot) {
		this.parking_slot = parking_slot;
	}
	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", vehicle_number=" + vehicle_number + ", parking_slot=" + parking_slot + "]";
	}
	
	
	
	
}
