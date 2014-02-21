package com.Mesosphere;

public interface ElevatorControlInterface {

	ElevatorStatus getStatus(Integer elevatorId);

	void update(Integer elevatorId, Integer fromFloor, Integer toFloor);

	void step();

	void pickup(Integer elevatorId, Integer fromFloor);

}
