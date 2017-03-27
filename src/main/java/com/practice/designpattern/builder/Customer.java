package com.practice.designpattern.builder;


//Concrete builder to build coffee
class CoffeeBuilder extends DrinkBuilder {
	public void buildSize() {
		this.hotel.setSize("medium");
		System.out.println("build medium size");
	}

	public void buildDrink() {
		this.hotel.setDrink("coffee");
		System.out.println("build coffee");
	}
}

//director to encapsulate the builder
class Waiter {
	private DrinkBuilder drinkBuilder;

	public void setDrinkBuilder(DrinkBuilder builder) {
		drinkBuilder = builder;
	}

	public DrinksHotel getDrinkHotel() {
		return drinkBuilder.getHotel();
	}

	public void constructDrink() {
		drinkBuilder.buildSize();
		drinkBuilder.buildSize();
	}
}

//customer
public class Customer {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		DrinkBuilder coffeeBuilder = new CoffeeBuilder();

		//Alternatively you can use tea builder to build a tea
		//StarbucksBuilder teaBuilder = new TeaBuilder();

		waiter.setDrinkBuilder(coffeeBuilder);
		waiter.constructDrink();

		//get the drink built
//		Drink drink = waiter.getstarbucksDrink();

	}
}