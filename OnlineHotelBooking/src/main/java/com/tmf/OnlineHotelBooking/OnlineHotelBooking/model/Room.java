package com.tmf.OnlineHotelBooking.OnlineHotelBooking.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Room {
	private long id;
	private String roomType;
	private BigDecimal roomprice;
	private boolean isBooked=false;
	private List<BookedRoom> bookings;

public Room() {
	this.bookings = new ArrayList<>();
	
	
}	

}
