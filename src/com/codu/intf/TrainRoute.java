package com.codu.intf;

import java.util.LinkedHashMap;
import java.util.Map;

import com.codu.modal.Train;
import com.codu.util.StationCode;

/*
 * Train Route for Train A & Train B
 */
public interface TrainRoute {

	static Map<String, Train> _TRAIN_A = new LinkedHashMap<>();
	static Map<String, Train> _TRAIN_B = new LinkedHashMap<>();
	
	public static void init() {

		// Initializing Train A Map
		_TRAIN_A.put(StationCode.CHN.name(),new Train("CHENNAI", StationCode.CHN.name(), 0)); // CHENNAI (CHN) - 0
		_TRAIN_A.put(StationCode.SLM.name(),new Train("SALEM", StationCode.SLM.name(), 350)); // SALEM (SLM) - 350
		_TRAIN_A.put(StationCode.BLR.name(),new Train("BANGALORE", StationCode.BLR.name(), 550)); // BANGALORE (BLR) - 550
		_TRAIN_A.put(StationCode.KRN.name(),new Train("KURNOOL", StationCode.KRN.name(), 900)); // KURNOOL (KRN) - 900
		_TRAIN_A.put(StationCode.HYB.name(),new Train("HYDERABAD", StationCode.HYB.name(), 1200,true)); // HYDERABAD (HYB) - 1200
		_TRAIN_A.put(StationCode.NGP.name(),new Train("NAGPUR", StationCode.NGP.name(), 1600,true)); // NAGPUR (NGP) - 1600
		_TRAIN_A.put(StationCode.ITJ.name(),new Train("ITARSI", StationCode.ITJ.name(), 1900,true)); // ITARSI (ITJ) - 1900
		_TRAIN_A.put(StationCode.BPL.name(),new Train("BHOPAL", StationCode.BPL.name(), 2000,true)); // BHOPAL (BPL) - 2000
		_TRAIN_A.put(StationCode.AGA.name(),new Train("AGRA", StationCode.AGA.name(), 2500,false,true)); // AGRA (AGA) - 2500
		_TRAIN_A.put(StationCode.NDL.name(),new Train("NEW DELHI", StationCode.NDL.name(), 2700,false,true)); // NEW DELHI (NDL) - 2700

		// Initializing Train B Map
		_TRAIN_B.put(StationCode.TVC.name(),new Train("TRIVANDRUM", StationCode.TVC.name(), 0)); // TRIVANDRUM (TVC) - 0
		_TRAIN_B.put(StationCode.SRR.name(),new Train("SHORANUR", StationCode.SRR.name(), 300)); // SHORANUR (SRR) - 300
		_TRAIN_B.put(StationCode.MAQ.name(),new Train("MANGALORE", StationCode.MAQ.name(), 600)); // MANGALORE (MAQ) - 600
		_TRAIN_B.put(StationCode.MAO.name(),new Train("MADGAON", StationCode.MAO.name(), 1000)); // MADGAON (MAO) - 1000
		_TRAIN_B.put(StationCode.PNE.name(),new Train("PUNE", StationCode.PNE.name(), 1400)); // PUNE (PNE) - 1400
		_TRAIN_B.put(StationCode.HYB.name(),new Train("HYDERABAD", StationCode.HYB.name(), 2000,true)); // HYDERABAD (HYB) - 2000
		_TRAIN_B.put(StationCode.NGP.name(),new Train("NAGPUR", StationCode.NGP.name(), 2400,true)); // NAGPUR (NGP) - 2400
		_TRAIN_B.put(StationCode.ITJ.name(),new Train("ITARSI", StationCode.ITJ.name(), 2700,true)); // ITARSI (ITJ) - 2700
		_TRAIN_B.put(StationCode.BPL.name(),new Train("BHOPAL", StationCode.BPL.name(), 2800,true)); // BHOPAL (BPL) - 2800
		_TRAIN_B.put(StationCode.PTA.name(),new Train("PATNA", StationCode.PTA.name(), 3800,false,true)); // PATNA (PTA) - 3800
		_TRAIN_B.put(StationCode.NJP.name(),new Train("NEW JALPAIGURI", StationCode.NJP.name(), 4200,false,true)); // NEW JALPAIGURI (NJP) - 4200
		_TRAIN_B.put(StationCode.GHY.name(),new Train("GUWAHATI", StationCode.GHY.name(), 4700,false,true)); // GUWAHATI (GHY) - 4700

	}

	// Print Train Route Chart
	public static void printTrainChart() {

		System.out.println("----- Train A -----");

		for (String key : _TRAIN_A.keySet()) {
			System.out.println(_TRAIN_A.get(key));
		}

		System.out.println();
		System.out.println("----- Train B -----");

		for (String key : _TRAIN_B.keySet()) {
			System.out.println(_TRAIN_B.get(key));
		}

		System.out.println();
	}

	public static int getTrainDistance(String code, Map<String, Train> map) {
		return map.get(code).getDistance();
	}
}
