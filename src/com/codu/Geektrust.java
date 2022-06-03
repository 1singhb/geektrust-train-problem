package com.codu;

import java.util.List;

import com.codu.impl.ConsoleTrainWriter;
import com.codu.impl.TrainInputReaderImpl;
import com.codu.impl.TrainJourneyImpl;
import com.codu.impl.TrainRouteParserImpl;
import com.codu.intf.TrainInputReader;
import com.codu.intf.TrainJourney;
import com.codu.intf.TrainRoute;
import com.codu.intf.TrainRouteParser;
import com.codu.intf.TrainWriter;
import com.codu.modal.Train;
import com.codu.util.Constants;

public class Geektrust {

	public static void main(String[] args) {

		TrainInputReader reader = new TrainInputReaderImpl();
		TrainRouteParser parser = new TrainRouteParserImpl();
		TrainJourney journey = new TrainJourneyImpl();
		TrainWriter writer = new ConsoleTrainWriter();

		if (args.length != 0) {// if no file path is sent
			// Parse the file
			String routes[] = reader.read(args[0]);

			List<Train> routeOfTrainA = parser.parse(routes[0], TrainRoute._TRAIN_A, TrainRoute._TRAIN_B);
			List<Train> routeOfTrainB = parser.parse(routes[1], TrainRoute._TRAIN_B, TrainRoute._TRAIN_A);

			List<Train> arrivalOfTrainA = journey.arrival(routeOfTrainA, TrainRoute.getTrainDistance(TrainJourney.INIITAL_MERGE_STATION,TrainRoute._TRAIN_A));
			List<Train> arrivalOfTrainB = journey.arrival(routeOfTrainB, TrainRoute.getTrainDistance(TrainJourney.INIITAL_MERGE_STATION,TrainRoute._TRAIN_B));
			List<Train> departureOfTrainAB = journey.departure(arrivalOfTrainA, arrivalOfTrainB);

			// Print the output
			writer.write(journey.arrivalHeader(Constants.TRAIN_A), arrivalOfTrainA);
			writer.write(journey.arrivalHeader(Constants.TRAIN_B), arrivalOfTrainB);
			writer.write(journey.departerHeader(Constants.TRAIN_AB), departureOfTrainAB);
		}
		else
			System.out.println("file path parameter is missing!");
	}

}
