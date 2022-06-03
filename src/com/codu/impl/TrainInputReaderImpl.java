package com.codu.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.codu.intf.TrainInputReader;

public class TrainInputReaderImpl implements TrainInputReader {

	@Override
	public String[] read(String filePath) {
		String[] data = new String[2];
		int i = 0;
		try (Scanner scanner = new Scanner(new File(filePath));) {
			while (scanner.hasNextLine()) {
				data[i] = scanner.nextLine();
				System.out.println(data[i]);
				i++;
			}
			System.out.println();
			return data;
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while reading data from file.");
			e.printStackTrace();
		}

		return null;

	}

}
