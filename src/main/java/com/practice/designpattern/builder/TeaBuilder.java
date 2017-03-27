package com.practice.designpattern.builder;

public class TeaBuilder extends DrinkBuilder {

	@Override
	public void buildSize() {
		this.hotel.setSize("Medium");
	}

	@Override
	public void buildDrink() {
		this.hotel.setDrink("Tea");

	}

}
