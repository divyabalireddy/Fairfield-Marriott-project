package com.tmf.OnlineHotelBooking.OnlineHotelBooking.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
@AllArgsConstructor


public class BookingResponse {
	private Long bookingId;
	private LocalDate chechInDate;
	private LocalDate chechOutDate;
	private String guestFullName;
	private String guestEmail;
	private int NumOfAdults;
	private int NumOfChildren;
	private int totalNumberOfGuest;
	private String bookingConfirmationCode;
	private RoomResponse room;
	public BookingResponse(Long bookingId, LocalDate chechInDate, LocalDate chechOutDate,
			String bookingConfirmationCode) {
		super();
		this.bookingId = bookingId;
		this.chechInDate = chechInDate;
		this.chechOutDate = chechOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	

}
