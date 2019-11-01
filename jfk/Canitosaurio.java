package jfk;

import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Canitosaurio extends Robot {

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(2);
	                                                                                                                                                                                                    
		ahead(100);
	}
	
	@Override
public void run() {
	while(true){
		turnRight(180);
		
	}
}
}
