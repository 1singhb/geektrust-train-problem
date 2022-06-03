package com.codu.intf;

import java.util.List;

import com.codu.modal.Train;

/*
 * Train Output Writer
 */

public interface TrainWriter {

	public void write(String header, List<Train> list);

}
