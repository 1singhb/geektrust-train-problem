package com.codu.intf;

import java.util.List;

import com.codu.modal.Train;
import com.codu.util.StationCode;

/*
 * To find train arrival and departure
 */
public interface TrainJourney {

	public final static String INIITAL_MERGE_STATION = StationCode.HYB.name(); // Initial Merge Station is HYDERABAD

	public List<Train> arrival(List<Train> list, int mergeDistance);

	public List<Train> departure(List<Train> trainA, List<Train> trainB);

	public String arrivalHeader(String train);

	public String departerHeader(String train);
}
