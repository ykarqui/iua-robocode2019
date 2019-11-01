package roma;

import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Roboto extends Robot {

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
			fire(2);
		
	}

	@Override
	public void onHitWall(HitWallEvent event) {
	
	turnRight(1009);
	}
	
	@Override
	public void run() {

		
		while(true) {
			turnRight(110);
		    ahead(100);
			turnLeft(140);
			ahead(120);
			turnLeft(170);
			ahead(100);
			back(160);
			
		
			
			

		}
}
}