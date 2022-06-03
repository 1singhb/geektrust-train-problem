package com.codu.intf;

import java.util.List;
import java.util.Map;

import com.codu.modal.Train;

/*
 * Train Route Parser
 */

public interface TrainRouteParser {

	public List<Train> parse(String data, Map<String, Train> source, Map<String, Train> merge);

}
