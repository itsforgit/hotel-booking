package com.mindtree.hotelbooking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the booking database table.
 *
 */
@Entity
@Table(name = "booking")
@NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
public class Booking implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name = "check_in_date", nullable = false)
	private Date checkInDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "check_out_date", nullable = false)
	private Date checkOutDate;

	@Column(name = "created_date", nullable = false)
	private Date createdDate;

	@Column(name = "customer_name", nullable = false, length = 45)
	private String customerName;

	@Column(name = "no_of_rooms", nullable = false)
	private int noOfRooms;

	@Column(name = "total_amt", nullable = false)
	private Double totalAmt;

	// bi-directional many-to-one association to Hotel
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hotel_id", nullable = false)
	private Hotel hotel;

	// bi-directional many-to-one association to City
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	@Column(name = "adults", nullable = false)
	private Integer adults;

	@Column(name = "children")
	private Integer children;
	@Column(name = "email_id", nullable = false)
	private String emailID;

	public Booking() {
	}

	public Date getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getNoOfRooms() {
		return this.noOfRooms;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the totalAmt
	 */
	public Double getTotalAmt() {
		return totalAmt;
	}

	/**
	 * @param totalAmt
	 *            the totalAmt to set
	 */
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
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

	@Override
	public String toString() {
		return "Booking{" + "id=" + id + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", createdDate=" + createdDate + ", customerName=" + customerName + ", noOfRooms=" + noOfRooms
				+ ", hotel=" + hotel + ", city=" + city + '}';
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
