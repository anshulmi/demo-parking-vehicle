package com.example.demoparkingvehicle.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ParkingVehicle")
public class ParkingVehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id")
	private long id; 
	
	@Column(name = "vehicle_number")
	private String vehicle_number;
	
	@Column (name = "entry_time")
	private Date entry_time;

	@Column (name = "exit_time")
	private Date exit_time;
	
	@Column (name = "parking_slot")
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
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public Date getExit_time() {
		return exit_time;
	}
	public void setExit_time(Date exit_time) {
		this.exit_time = exit_time;
	}
	public int getParking_slot() {
		return parking_slot;
	}
	public void setParking_slot(int parking_slot) {
		this.parking_slot = parking_slot;
	}
	
	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", vehicle_number=" + vehicle_number + ", entry_time=" + entry_time
				+ ", exit_time=" + exit_time + ", parking_slot=" + parking_slot + "]";
	}
}
