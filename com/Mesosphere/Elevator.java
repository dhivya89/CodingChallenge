package com.Mesosphere;

import java.util.LinkedList;

public class Elevator implements ElevatorInterface {

	private ElevatorStatus status;
	private Integer id;
	private Integer maxFloors;
	private LinkedList<Integer> queue;
	private Integer curFloor;
	
	public Elevator(Integer id, Integer fromFloor, Integer maxFloors) {
		this.id = id;
		this.maxFloors = maxFloors;
		this.curFloor = fromFloor;
		status = new ElevatorStatus(this.id, true);
	}

	@Override
	public ElevatorStatus getStatus() {
		return status;
	}

	@Override
	public void addRequest(Integer fromFloor) {
		queue.add(fromFloor);
	}
	
	@Override
	public void tick() {
		Integer toFloor = curFloor;
		
		if(status.isIdle) {
			if(!queue.isEmpty()) {
				toFloor = queue.getFirst();
			}
			else return;
		}
		
		if(curFloor < toFloor)
			curFloor++;
		else if(curFloor > toFloor)
			curFloor--;
		else queue.removeFirst();		
	}

}
