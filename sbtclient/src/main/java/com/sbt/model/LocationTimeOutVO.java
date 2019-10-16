package com.sbt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LocationTimeOutVO {
	
	@Id
	private String resellerName;
	
	private Long APID;
	
	private Long macExpiryTime;
	
	public LocationTimeOutVO() {
		System.out.println("LocationTimeOutVO created");
	}
	
	public LocationTimeOutVO(String resellerName, Long aPID, Long macExpiryTime) {
		this.resellerName = resellerName;
		APID = aPID;
		this.macExpiryTime = macExpiryTime;
	}



	public String getResellerName() {
		return resellerName;
	}

	public void setResellerName(String resellerName) {
		this.resellerName = resellerName;
	}

	public Long getAPID() {
		return APID;
	}

	public void setAPID(Long aPID) {
		APID = aPID;
	}

	public Long getMacExpiryTime() {
		return macExpiryTime;
	}

	public void setMacExpiryTime(Long macExpiryTime) {
		this.macExpiryTime = macExpiryTime;
	}

	@Override
	public String toString() {
		return "LocationTimeOutVO [resellerName=" + resellerName + ", APID=" + APID + ", macExpiryTime=" + macExpiryTime
				+ "]";
	}
}
