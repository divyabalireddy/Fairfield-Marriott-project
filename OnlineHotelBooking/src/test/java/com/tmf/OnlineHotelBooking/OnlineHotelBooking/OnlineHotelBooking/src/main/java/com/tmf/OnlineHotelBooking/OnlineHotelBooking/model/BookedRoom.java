package com.tmf.OnlineHotelBooking.OnlineHotelBooking.model;

import java.time.LocalDate;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class BookedRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	@Column(name= "check_In")
	private LocalDate chechInDate;
	@Column(name= "check_Out")
	private LocalDate chechOutDate;
	@Column(name= "Guesr_FullName")
	private String guestFullName;
	@Column(name= "Guest_Email")
	private String guestEmail;
	@Column(name= "adults")
	private int NumOfAdults;
	@Column(name= "children")
	private int NumOfChildren;
	@Column(name= "total_guest")
	private int totalNumberOfGuest;
	@Column(name= "confirmation_code")
	private String bookingConfirmationCode;
	@ManyToOne(fetch =FetchType.LAZY)
	
	@JoinColumn(name= "room_id")
	private Room room;
	public void calculateTotalNumberOfGuest()
	{
		this.totalNumberOfGuest = this.NumOfAdults + this.NumOfChildren;
		
	}
	
	public void setNumOfAdults(int numOfAdults) {
		NumOfAdults = numOfAdults;
		calculateTotalNumberOfGuest();
	}
	
	public void setNumOfChildren(int numOfChildren) {
		NumOfChildren = numOfChildren;
		calculateTotalNumberOfGuest();
	}

	public BookedRoom(String bookingConfirmationCode) {
		super();
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
}



