package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightDestinations {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long destinationId;
	private String destinationCountry;
	private String destinationCity;
	private String destinationDistance;
	private String destinationPrice;

	public FlightDestinations() {
	}

	public FlightDestinations(String destinationCountry, String destinationCity, String destinationDistance,
			String destinationPrice) {

		this.setDestinationCountry(destinationCountry);
		this.setDestinationCity(destinationCity);
		this.setDestinationDistance(destinationDistance);
		this.setDestinationPrice(destinationPrice);

	}
	

	public String getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getDestinationDistance() {
		return destinationDistance;
	}

	public void setDestinationDistance(String destinationDistance) {
		this.destinationDistance = destinationDistance;
	}

	public String getDestinationPrice() {
		return destinationPrice;
	}

	public void setDestinationPrice(String destinationPrice) {
		this.destinationPrice = destinationPrice;
	}

	private Long getDestinationId() {
		return destinationId;
	}

	private void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
	}

}