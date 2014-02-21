
package com.Mesosphere;

import java.util.ArrayList;


public class ElevatorControlSystem implements ElevatorControlInterface {

  private Integer elevatorCount;
	private Integer maxFloors;
  ArrayList<Elevator> elevators;

	public ElevatorControlSystem(Integer elevatorCount, Integer maxFloors) {
  	this.elevatorCount = elevatorCount;
  	this.maxFloors = maxFloors;
  	
  	for(int i=0; i<this.elevatorCount; i ++) {
      elevators.add(new Elevator(i, 0, this.maxFloors));
  	}
  	
  }
	
	@Override
	public ArrayList<ElevatorStatus> getStatus() {
		ArrayList<ElevatorStatus> statusList = new ArrayList<ElevatorStatus>();
		
		for(Elevator myElevator: elevators) {
			statusList.add(myElevator.getStatus());
		}
		
		return statusList;
	}
	
	@Override
	public ElevatorStatus update(Integer elevatorId) {
		return elevators.get(elevatorId).getStatus();
	}
	
	@Override
	public void pickup(Integer elevatorId, Integer fromFloor) {
		Elevator el = elevators.get(elevatorId);
		el.addRequest(fromFloor);
	}
	
	@Override
	public void step() {
		
		for(Elevator myElevator: elevators) {
			myElevator.tick();
		}
		
	}
	
}
