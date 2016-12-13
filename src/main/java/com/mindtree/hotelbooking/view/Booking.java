/**
 * 
 */
package com.mindtree.hotelbooking.view;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @author M1030360
 *
 */
@Component
public class Booking {

	@NotNull(message = "Check in Date is required")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date checkInDate;
	@NotNull(message = "Check Out Date is required")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date checkOutDate;
	@NotNull
	@NotEmpty(message = "Please enter your Name.")
	private String customerName;

	@NotNull(message = "Please enter No of Rooms required.")
	@Min(1)
	private Integer noOfRooms;
	@NotNull
	@NotEmpty(message = "Please select a City.")
	private String cityID;

	@NotNull
	@NotEmpty(message = "Please select a hotel.")
	private String hotelID;

	@NotNull(message = "Please enter the value")
	private Integer adults;

	private Integer children;
	private String sortBy;
	@Email
	@NotEmpty
	private String emailID;
	
	/**
	 * @return the sortBy
	 */
	public String getSortBy() {
		return sortBy;
	}

	/**
	 * @param sortBy
	 *            the sortBy to set
	 */
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	/**
	 * @return the adults
	 */
	public Integer getAdults() {
		return adults;
	}

	/**
	 * @param adults
	 *            the adults to set
	 */
	public void setAdults(Integer adults) {
		this.adults = adults;
	}

	/**
	 * @return the children
	 */
	public Integer getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(Integer children) {
		this.children = children;
	}

	/**
	 * @return the checkInDate
	 */
	public Date getCheckInDate() {
		return checkInDate;
	}

	/**
	 * @param checkInDate
	 *            the checkInDate to set
	 */
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	/**
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * @param checkOutDate
	 *            the checkOutDate to set
	 */
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the noOfRooms
	 */
	public Integer getNoOfRooms() {
		return noOfRooms;
	}

	/**
	 * @param noOfRooms
	 *            the noOfRooms to set
	 */
	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	/**
	 * @return the cityID
	 */
	public String getCityID() {
		return cityID;
	}

	/**
	 * @param cityID
	 *            the cityID to set
	 */
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	/**
	 * @return the hotelID
	 */
	public String getHotelID() {
		return hotelID;
	}

	/**
	 * @param hotelID
	 *            the hotelID to set
	 */
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
