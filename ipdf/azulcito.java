package ipdf;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class azulcito extends Robot {
	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(3);
	}
	
	@Override
	public void run() {
		
		turnLeft(getHeading());
		ahead(getBattleFieldHeight()-getY());
		turnLeft(90);
		ahead(getX());
		turnLeft(90);
		ahead(getBattleFieldHeight()/2);
		turnLeft(90);
		ahead(getBattleFieldWidth()/2);
	    turnLeft(90);
		while(true) {
			
			turnLeft(Math.random()*5);
			
			ahead(getBattleFieldHeight()-getY());
			
			ahead(getX());
			turnLeft(90);
			ahead(getBattleFieldHeight()/2);
			turnLeft(90);
			ahead(getBattleFieldWidth());
		    turnRight(90);
		    ahead(getX());
		    turnLeft(110);
		   
			
	}
}
}