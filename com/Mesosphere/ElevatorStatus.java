package com.Mesosphere;

public class ElevatorStatus {
	
	private Boolean isIdle;
	private Integer elevatorId;
	private Integer toFloor;

	public ElevatorStatus(Integer elevatorId, Boolean isIdle) {
		this.elevatorId = elevatorId;
		this.isIdle = isIdle;
		
	}
	
	public void setToFloor(Integer floorNo) {
		this.toFloor = floorNo;
	}
	
}
