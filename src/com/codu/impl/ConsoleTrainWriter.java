package com.codu.impl;

import java.util.List;

import com.codu.intf.TrainWriter;
import com.codu.modal.Train;
import com.codu.util.Constants;

public class ConsoleTrainWriter implements TrainWriter {

	@Override
	public void write(String header, List<Train> list) {

		StringBuilder journey = new StringBuilder();

		//If there are no passenger bogies to travel from Hyderabad station, then train should stop there. In such a case it should print JOURNEY_ENDED
		if (list.isEmpty())
			System.out.println(header + Constants.SPACE + Constants.JOURNEY_ENDED);
		else {
			for (Train train : list) {
				journey.append(Constants.SPACE);
				journey.append(train.getCode());
			}

			System.out.println(header + journey);
		}
	}

}
