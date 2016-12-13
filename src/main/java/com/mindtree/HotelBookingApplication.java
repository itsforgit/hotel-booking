package com.mindtree;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mindtree.hotelbooking.model.City;
import com.mindtree.hotelbooking.model.Hotel;
import com.mindtree.hotelbooking.repository.CityRepository;
import com.mindtree.hotelbooking.repository.HotelRepository;

@SpringBootApplication
public class HotelBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingApplication.class, args);
	}

	
	/**
	 * Insert the list of values to city table
	 * @param repository
	 * @return
	 */
	@Bean
	public CommandLineRunner loadCityData(CityRepository repository) {
		return (args) -> {
			repository.save(new City(1l, "Chennai"));
			repository.save(new City(2l, "Banglore"));
			repository.save(new City(3l, "Mumbai"));
			repository.save(new City(4l, "Delhi"));
			repository.save(new City(5l, "Hyderabad"));
			repository.save(new City(6l, "Ahmedabad"));
			repository.save(new City(7l, "Kolkata"));
			repository.save(new City(8l, "Pune"));
			repository.save(new City(9l, "Jaipur"));
			repository.save(new City(10l, "Lucknow"));
			repository.save(new City(11l, "Kanpur"));
						            
			                        
		};
	}

	/**
	 * Insert the list of values to Hotel table
	 * @param repository
	 * @return
	 */
	@Bean
	public CommandLineRunner loadHotel(HotelRepository repository) {
		return (args) -> {

			repository.save(new Hotel(1l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(1l))));
			repository.save(new Hotel(2l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(1l))));
			repository.save(new Hotel(3l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(1l))));
			repository.save(new Hotel(4l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(1l))));
			repository.save(new Hotel(5l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(1l))));
			repository.save(new Hotel(6l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(1l))));
			repository.save(new Hotel(7l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(1l))));
			repository.save(new Hotel(8l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(1l))));
			repository.save(new Hotel(9l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(1l))));
			repository.save(new Hotel(10l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(1l))));
			repository.save(new Hotel(11l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(2l))));
			repository.save(new Hotel(12l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(2l))));
			repository.save(new Hotel(13l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(2l))));
			repository.save(new Hotel(14l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(2l))));
			repository.save(new Hotel(15l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(2l))));
			repository.save(new Hotel(16l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(2l))));
			repository.save(new Hotel(17l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(2l))));
			repository.save(new Hotel(18l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(2l))));
			repository.save(new Hotel(19l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(2l))));
			repository.save(new Hotel(20l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(2l))));
			repository.save(new Hotel(21l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(3l))));
			repository.save(new Hotel(22l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(3l))));
			repository.save(new Hotel(23l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(3l))));
			repository.save(new Hotel(24l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(3l))));
			repository.save(new Hotel(25l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(3l))));
			repository.save(new Hotel(26l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(3l))));
			repository.save(new Hotel(27l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(3l))));
			repository.save(new Hotel(28l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(3l))));
			repository.save(new Hotel(29l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(3l))));
			repository.save(new Hotel(30l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(3l))));
			repository.save(new Hotel(31l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(4l))));
			repository.save(new Hotel(32l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(4l))));
			repository.save(new Hotel(33l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(4l))));
			repository.save(new Hotel(34l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(4l))));
			repository.save(new Hotel(35l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(4l))));
			repository.save(new Hotel(36l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(4l))));
			repository.save(new Hotel(37l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(4l))));
			repository.save(new Hotel(38l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(4l))));
			repository.save(new Hotel(39l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(4l))));
			repository.save(new Hotel(40l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(4l))));
			repository.save(new Hotel(41l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(5l))));
			repository.save(new Hotel(42l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(5l))));
			repository.save(new Hotel(43l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(5l))));
			
			repository.save(new Hotel(44l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(5l))));
			repository.save(new Hotel(45l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(5l))));
			repository.save(new Hotel(46l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(5l))));
			repository.save(new Hotel(47l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(5l))));
			repository.save(new Hotel(48l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(5l))));
			repository.save(new Hotel(49l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(5l))));
			repository.save(new Hotel(50l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(5l))));
			repository.save(new Hotel(51l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(6l))));
			repository.save(new Hotel(52l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(6l))));
			repository.save(new Hotel(53l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(6l))));
			repository.save(new Hotel(54l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(6l))));
			repository.save(new Hotel(55l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(6l))));
			repository.save(new Hotel(56l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(6l))));
			repository.save(new Hotel(57l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(6l))));
			repository.save(new Hotel(58l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(6l))));
			repository.save(new Hotel(59l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(6l))));
			repository.save(new Hotel(60l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(6l))));
			repository.save(new Hotel(61l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(7l))));
			repository.save(new Hotel(62l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(7l))));
			repository.save(new Hotel(63l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(7l))));
			repository.save(new Hotel(64l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(7l))));
			repository.save(new Hotel(65l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(7l))));
			repository.save(new Hotel(66l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(7l))));
			repository.save(new Hotel(67l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(7l))));
			repository.save(new Hotel(68l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(7l))));
			repository.save(new Hotel(69l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(7l))));
			repository.save(new Hotel(70l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(7l))));
			repository.save(new Hotel(71l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(8l))));
			repository.save(new Hotel(72l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(8l))));
			repository.save(new Hotel(73l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(8l))));
			repository.save(new Hotel(74l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(8l))));
			repository.save(new Hotel(75l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(8l))));
			repository.save(new Hotel(76l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(8l))));
			repository.save(new Hotel(77l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(8l))));
			repository.save(new Hotel(78l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(8l))));
			repository.save(new Hotel(79l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(8l))));
			repository.save(new Hotel(80l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(8l))));
			repository.save(new Hotel(81l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(9l))));
			repository.save(new Hotel(82l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(9l))));
			repository.save(new Hotel(83l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(9l))));
			repository.save(new Hotel(84l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(9l))));
			repository.save(new Hotel(85l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(9l))));
			repository.save(new Hotel(86l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(9l))));
			repository.save(new Hotel(87l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(9l))));
			repository.save(new Hotel(88l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(9l))));
			repository.save(new Hotel(89l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(9l))));
			repository.save(new Hotel(90l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(9l))));
			repository.save(new Hotel(91l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(10l))));
			repository.save(new Hotel(92l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(10l))));
			repository.save(new Hotel(93l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(10l))));
			repository.save(new Hotel(94l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(10l))));
			repository.save(new Hotel(95l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(10l))));
			repository.save(new Hotel(96l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(10l))));
			repository.save(new Hotel(97l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(10l))));
			repository.save(new Hotel(98l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(10l))));
			repository.save(new Hotel(99l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(10l))));
			repository.save(new Hotel(100l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(10l))));
			repository.save(new Hotel(101l,"Chola Sheraton ",10, "4.5", 5000.0, "/image/hotel_img1.jpg",	   		(new City(11l))));
			repository.save(new Hotel(102l,"Taj Fisherman's Cove ",10, "4.2", 2000.0, "/image/hotel_img2.jpg",	(new City(11l))));
			repository.save(new Hotel(103l,"Taj Connemara ",10, "4.1", 9000.0, "/image/hotel_img3.jpg",	   		(new City(11l))));
			repository.save(new Hotel(104l,"The Trident ",10, "4.3", 1000.0, "/image/hotel_img4.jpg",			(new City(11l))));
			repository.save(new Hotel(105l,"Taj Coromandel ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",			(new City(11l))));
			repository.save(new Hotel(106l,"Hotel Tulip Aruna ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(11l))));
			repository.save(new Hotel(107l,"Golden Palms Hotel & Spa",10, "4.5", 6500.0, "/image/10.jpg", 		(new City(11l))));
			repository.save(new Hotel(108l,"The Taj West End ",10, "4.6", 6000.0, "/image/hotel_img5.jpg",		(new City(11l))));
			repository.save(new Hotel(109l,"Taj Hari Mahal ",10, "4.7", 7000.0, "/image/hotel_img6.jpg", 		(new City(11l))));
			repository.save(new Hotel(110l,"Umaid Bhawan Palac",10, "4.5", 6500.0, "/image/10.jpg", 				(new City(11l))));
			                         
		};                                 
	}
}
