package com.practice.designpattern.builder;

public abstract class DrinkBuilder {
	
	protected DrinksHotel hotel = new DrinksHotel();
	
	
	/**
	 * @return the hotel
	 */
	public DrinksHotel getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(DrinksHotel hotel) {
		this.hotel = hotel;
	}

	public abstract void buildSize();

	public abstract void buildDrink();

}
