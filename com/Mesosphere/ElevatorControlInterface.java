package com.Mesosphere;

import java.util.ArrayList;

public interface ElevatorControlInterface {

	ArrayList<ElevatorStatus> getStatus();

	ElevatorStatus update(Integer elevatorId);

	void pickup(Integer elevatorId, Integer fromFloor);

	void step();

}
