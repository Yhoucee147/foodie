package com.moversly.foodie.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LogicImpl {

	public List<FoodDetails> readFile(){
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("foodie.txt")));
			TotalTime.setTotalTime(Long.parseLong(br.readLine()));
			long dataLength = Long.parseLong(br.readLine());
			List<FoodDetails> foodDetails = new ArrayList<>();
			for(int i = 0; i < dataLength; i++) {
				String line = br.readLine();
				String [] lineDetails = line.split(" ");
				foodDetails.add(new FoodDetails(Long.parseLong(lineDetails[0]), Long.parseLong(lineDetails[1])));
			}
			br.close();
			return foodDetails;
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public long calculateMaximumSatisfactionValue(List<FoodDetails> details) {
		long totalTimeTemp = Long.MIN_VALUE;
		long statsVal = Long.MIN_VALUE;
		for(int i = 0; i < details.size() -2; i++) {
			long innerTime = 0;
			long innerStats = 0;
			FoodDetails foodie = details.get(i);
			for(int j = i+1; j < details.size(); j++) {
			FoodDetails foodie2 = details.get(j);
			innerTime = foodie.getTimeTaken() + foodie2.getTimeTaken();
			if(innerTime > totalTimeTemp && innerTime < TotalTime.getTotalTime()) {
				innerStats = foodie.getAmountOfSatisfaction() + foodie2.getAmountOfSatisfaction();
				if(innerStats > statsVal) {
					statsVal = innerStats;
					totalTimeTemp = innerTime;
				}
			}
		 }
		}
		return statsVal;
	}
	
}
