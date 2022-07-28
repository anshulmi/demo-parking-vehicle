DROP TABLE IF EXISTS ParkingVehicle;  
CREATE TABLE ParkingVehicle (  
id INT AUTO_INCREMENT  PRIMARY KEY,  
vehicle_number VARCHAR(50) NOT NULL,  
entry_time DATE NOT NULL,
exit_time DATE NOT NULL,
parking_slot INT
);  

