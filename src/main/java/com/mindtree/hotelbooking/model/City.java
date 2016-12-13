package com.mindtree.hotelbooking.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the city database table.
 *
 */
@Entity
@Table(name = "city")
@NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "city_id", unique = true, nullable = false)
	private Long cityId;

	@Column(name = "city_name", nullable = false, length = 50)
	private String cityName;

	// bi-directional many-to-one association to Booking
	@OneToMany(mappedBy = "city")
	private List<Booking> bookings;

	// bi-directional many-to-one association to Hotel
	@OneToMany(mappedBy = "city")
	private List<Hotel> hotels;

	public City() {
	}

	public City(Long cityId) {
		super();
		this.cityId = cityId;
	}

	/**
	 * @param cityId
	 * @param cityName
	 */
	public City(Long cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}

	/**
	 * @return the cityId
	 */
	public Long getCityId() {
		return cityId;
	}

	/**
	 * @param cityId
	 *            the cityId to set
	 */
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the bookings
	 */
	public List<Booking> getBookings() {
		return bookings;
	}

	/**
	 * @param bookings
	 *            the bookings to set
	 */
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	/**
	 * @return the hotels
	 */
	public List<Hotel> getHotels() {
		return hotels;
	}

	/**
	 * @param hotels
	 *            the hotels to set
	 */
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

}
