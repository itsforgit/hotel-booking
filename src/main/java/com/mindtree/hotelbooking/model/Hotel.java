package com.mindtree.hotelbooking.model;

import java.io.Serializable;

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

/**
 * The persistent class for the hotel database table.
 *
 */
@Entity
@Table(name = "hotel")
@NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
public class Hotel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(name = "hotel_img_path")
	private String hotelImgPath;

	@Column(name = "hotel_name", nullable = false, length = 45)
	private String hotelName;

	@Column(name = "no_of_rooms", nullable = false)
	private int noOfRooms;

	@Column(nullable = false, length = 45)
	private String rating;

	@Column(name = "tariff_per_day", nullable = false)
	private double tariffPerDay;

//	// bi-directional many-to-one association to Booking
//	@OneToMany(mappedBy = "hotel")
//	private List<Booking> bookings;

	// bi-directional many-to-one association to City
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	public Hotel() {
	}

	/**
	 * @param id
	 * @param hotelName
	 * @param noOfRooms
	 * @param rating
	 * @param tariffPerDay
	 * @param city
	 */
	public Hotel(Long id, String hotelName, int noOfRooms, String rating, double tariffPerDay, String hotelImgPath,
			City city) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.noOfRooms = noOfRooms;
		this.rating = rating;
		this.tariffPerDay = tariffPerDay;
		this.city = city;
		this.hotelImgPath = hotelImgPath;
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

	/**
	 * @return the hotelImgPath
	 */
	public String getHotelImgPath() {
		return hotelImgPath;
	}

	/**
	 * @param hotelImgPath
	 *            the hotelImgPath to set
	 */
	public void setHotelImgPath(String hotelImgPath) {
		this.hotelImgPath = hotelImgPath;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName
	 *            the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the noOfRooms
	 */
	public int getNoOfRooms() {
		return noOfRooms;
	}

	/**
	 * @param noOfRooms
	 *            the noOfRooms to set
	 */
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the tariffPerDay
	 */
	public double getTariffPerDay() {
		return tariffPerDay;
	}

	/**
	 * @param tariffPerDay
	 *            the tariffPerDay to set
	 */
	public void setTariffPerDay(double tariffPerDay) {
		this.tariffPerDay = tariffPerDay;
	}


	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

}
