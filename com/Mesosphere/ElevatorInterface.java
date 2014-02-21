package com.Mesosphere;

public interface ElevatorInterface {

	ElevatorStatus getStatus();

	void addRequest(Integer fromFloor);

	void tick();

}
