package com.codu.modal;

/*
 * Train Entity
 * Property : Name, Code, Merged, Allowed, Distance
 * Name : String -> Contain Station Name
 * Code : String -> Contain Station Code
 * Merged : Boolean -> TRUE if Station is a merge Station else FALSE
 * Allowed : Boolean -> TRUE if Traveling is allowed from different route else FALSE
 * Distance : Integer -> Contain distance in KM from On boarding Station
 */

public class Train implements Comparable<Train> {

	String name;
	String code;
	boolean merged; 
	boolean allowed;
	int distance;

	public Train(String code, int distance) {
		super();
		this.name = "Unknown";
		this.code = code;
		this.distance = distance;
		this.merged = false;
		this.allowed = false;
	}

	public Train(String name, String code, int distance) {
		super();
		this.name = name;
		this.code = code;
		this.distance = distance;
		this.merged = false;
		this.allowed = false;
	}

	public Train(String name, String code, int distance, boolean merged) {
		super();
		this.name = name;
		this.code = code;
		this.distance = distance;
		this.merged = merged;
		this.allowed = false;
	}

	public Train(String name, String code, int distance, boolean merged, boolean allowed) {
		super();
		this.name = name;
		this.code = code;
		this.distance = distance;
		this.merged = merged;
		this.allowed = allowed;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMerged() {
		return merged;
	}

	public void setMerged(boolean merged) {
		this.merged = merged;
	} 

	public boolean isAllowed() {
		return allowed;
	}

	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
	}

	@Override
	public String toString() {
		return name + " (" + code + ") - " + distance;
	}

	@Override
	public int compareTo(Train target) {

		// For Descending order
		return target.getDistance() - this.distance ;

	}

}
