package roma;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class TreMendo extends Robot {
	
	@Override
	
	public void onScannedRobot(ScannedRobotEvent event)
	{	fire(2);
	}
		


	@Override
	public void run() {
		turnLeft(100) ;
		ahead (30) ;
		back(30);
		turnRight (90);
		ahead(20);

		back (15);
		turnLeft(90);
	
		while(true) {
			ahead(100);
			turnRight(90);
	
	}

	}
}