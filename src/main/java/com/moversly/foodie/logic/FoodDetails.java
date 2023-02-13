package com.moversly.foodie.logic;

public class FoodDetails {

	private long amountOfSatisfaction;
	private long timeTaken;
	
	public FoodDetails(long amountOfSatisfaction, long timeTaken) {
		super();
		this.amountOfSatisfaction = amountOfSatisfaction;
		this.timeTaken = timeTaken;
	}

	public long getAmountOfSatisfaction() {
		return amountOfSatisfaction;
	}

	public void setAmountOfSatisfaction(long amountOfSatisfaction) {
		this.amountOfSatisfaction = amountOfSatisfaction;
	}

	public long getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(long timeTaken) {
		this.timeTaken = timeTaken;
	}
	
}
