
package com.Mesosphere;

import java.util.ArrayList;


public class ElevatorControlSystem implements ElevatorControlInterface {

  private Integer elevatorCount;
	private Integer floorCount;
  ArrayList<Elevator> elevators;

	public ElevatorControlSystem(Integer elevatorCount, Integer floorCount) {
  	this.elevatorCount = elevatorCount;
  	this.floorCount = floorCount;
  	
  	for(int i=0; i<this.elevatorCount; i ++) {
      elevators.add(new Elevator(0));
  	}
  	
  }
	
	@Override
	public ElevatorStatus getStatus(Integer elevatorId) {
		return elevators.get(elevatorId).getStatus();
	}
	
	@Override
	public void update(Integer elevatorId, Integer fromFloor, Integer toFloor) {
		
	}
	
	@Override
	public void pickup(Integer elevatorId, Integer fromFloor) {
		
	}
	
	@Override
	public void step() {
		
		for(Elevator myElevator: elevators) {
			
		}
		
	}


	
}
