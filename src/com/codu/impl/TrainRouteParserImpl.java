package com.codu.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.codu.intf.TrainJourney;
import com.codu.intf.TrainRouteParser;
import com.codu.modal.Train;
import com.codu.util.Constants;

public class TrainRouteParserImpl implements TrainRouteParser {

	@Override
	public List<Train> parse(String data, Map<String, Train> source, Map<String, Train> merge) {
		List<Train> train = new ArrayList<>();

		String[] bogies = data.split(Constants.SPACE);

		for (String bogie : bogies) {

			if (merge.get(bogie) != null && merge.get(bogie).isAllowed()) // consider train station available in train
				train.add(merge.get(bogie));
			if (source.get(bogie) != null && merge.get(bogie) != null && source.get(bogie).getCode() != TrainJourney.INIITAL_MERGE_STATION)
				if (source.get(bogie).getDistance() < merge.get(bogie).getDistance())
					train.add(source.get(bogie));
				else
					train.add(merge.get(bogie));
			else if (source.get(bogie) != null) // consider train station available in train route
				train.add(source.get(bogie));
		}
		
		return train;
	}

}
