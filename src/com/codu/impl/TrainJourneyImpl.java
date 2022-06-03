package com.codu.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.codu.intf.TrainJourney;
import com.codu.intf.TrainRoute;
import com.codu.modal.Train;
import com.codu.util.Constants;

public class TrainJourneyImpl implements TrainJourney, TrainRoute {

	static {
		TrainRoute.init(); // Initialize Train Route
	}

	@Override
	public List<Train> arrival(List<Train> list, int mergeDistance) {
		
		return list.stream().filter(train -> train.getDistance() >= mergeDistance).collect(Collectors.toList());
	
	}

	@Override
	public List<Train> departure(List<Train> trainA, List<Train> trainB) {

		// Merge the train bogies
		List<Train> trainAB = Stream.of(trainA, trainB).flatMap(x -> x.stream()).collect(Collectors.toList());
		
		Collections.sort(trainAB); // Sort as per required order

		return trainAB.stream().filter(train -> train.getCode() != INIITAL_MERGE_STATION).collect(Collectors.toList()); 
	}

	@Override
	public String arrivalHeader(String train) {

		StringBuilder header = new StringBuilder();

		header.append(Constants.ARRIVAL);
		header.append(Constants.SPACE);
		header.append(train);
		header.append(Constants.SPACE);
		header.append(Constants.ENGINE);

		return header.toString();

	}

	@Override
	public String departerHeader(String train) {

		StringBuilder header = new StringBuilder();

		header.append(Constants.DEPARTURE);
		header.append(Constants.SPACE);
		header.append(train);
		header.append(Constants.SPACE);
		header.append(Constants.ENGINE);
		header.append(Constants.SPACE);
		header.append(Constants.ENGINE);

		return header.toString();
	}

}
