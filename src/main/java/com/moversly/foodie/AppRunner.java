package com.moversly.foodie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.moversly.foodie.logic.FoodDetails;
import com.moversly.foodie.logic.LogicImpl;

@Component
public class AppRunner implements CommandLineRunner{

	@Autowired
	private LogicImpl logicImpl;
	
	@Override
	public void run(String... args) throws Exception {
		List<FoodDetails> details = logicImpl.readFile();
		long maxSatisfaction = logicImpl.calculateMaximumSatisfactionValue(details);
		System.out.println("The max satisfaction value is: " + maxSatisfaction);
	}

}
