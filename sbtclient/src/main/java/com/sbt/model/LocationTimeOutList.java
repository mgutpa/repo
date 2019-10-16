package com.sbt.model;

import java.util.List;

public class LocationTimeOutList {
	
	private List<LocationTimeOutVO> locationList;

	public LocationTimeOutList(List<LocationTimeOutVO> locationList) {
		super();
		this.setLocationList(locationList);
	}

	public List<LocationTimeOutVO> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<LocationTimeOutVO> locationList) {
		this.locationList = locationList;
	}
	
	

}
