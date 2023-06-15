package com.RailwayReservationAdminManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class RailwayReservationAdminManagementApplication {

	public static void main(String[] args) {
	SpringApplication.run(RailwayReservationAdminManagementApplication.class, args);
	}
//		AdminRepository ar  = context.getBean(AdminRepository.class);
//		 TrainDetails t =new  TrainDetails();
//		
//		t.setTrainNo(1010);
//		t.setTrainName("AmarkantakExpress");
//		t.setSourceStation("Bhopal");
//		t.setDestinationStation("jabalpur");
//		t.setArrivalTime("16:00");
//		t.setDeptTime("21:25");
//		t.setDuration("5h 25m");
//		t.setNoOfSeats(100);
//		t.setFirstClassACFare(1485);
//		t.setTwoTierAcFare(895);
//		t.setThreeTierAcFare(645);
//		t.setSleeperFare(255);
//		TrainDetails t2=ar.save(t);
//		System.out.println(t);
//	}

}
